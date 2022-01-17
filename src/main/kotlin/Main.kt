// Realizing the empty cinema room
fun cinema( rows: Int, seats: Int) {
    println("Cinema:")
    print(" ")
    for (i in 1..seats) print(" $i")
    println()
    for (i in 1..rows) {
        println("$i " + "S ".repeat(seats))
    }
}

// Evaluating the seat ticket
fun price(rows: Int, seats: Int, nR: Int): Int {
    if (rows * seats <= 60) {
        return 10
    } else if (nR <= rows / 2 ) {
        return 10
    } else return 8
}

fun main(args: Array<String>) {

    var rows = 10  // incorrect entry
    var seats = 10  // incorrect entry
    while(rows > 9) {
        println("Enter the number of rows:")
        rows = readLine()!!.toInt()
    }
    while (seats > 9) {
        println("Enter the number of seats in each row:")
        seats = readLine()!!.toInt()
    }
    cinema(rows, seats)
    val line = MutableList(seats) {"S"}
    var rs = mutableListOf<MutableList<String>>()
    repeat(rows) {
        rs.add(line.toMutableList())
    }

    println("Enter a row number:")
    val nR = readLine()!!.toInt()
    println("Enter a seat number in that row:")
    val nS = readLine()!!.toInt()
    println("Ticket price: $" + price(rows, seats, nR))
    rs[nR - 1][nS - 1] = "B"
    println("Cinema:")
    print(" ")
    for (i in 0 until seats) print(" ${i + 1}")
    for (i in 0..rows - 1) {
        println()
        print("${i + 1}")
        for (j in 0 until seats) {
            print(" ${rs[i][j]}")
        }
    }

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

}