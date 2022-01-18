fun cinema( rs: MutableList<MutableList<String>>, rows: Int, seats: Int, nR: Int, nS: Int ) {
    println("Cinema:")
    print(" ")
    if (nR > 0 && nS > 0) {
        rs[nR - 1][nS - 1] = "B"
        for (i in 0 until seats) print(" ${i + 1}")
        for (i in 0..rows - 1) {
            println()
            print("${i + 1}")
            for (j in 0 until seats) {
                print(" ${rs[i][j]}")
            }
        }
    } else {
        for (i in 0 until seats) print(" ${i + 1}")
        for (i in 0..rows - 1) {
            println()
            print("${i + 1}")
            for (j in 0 until seats) {
                print(" ${rs[i][j]}")
            }
        }
    }
}

// Pricing the seat ticket
fun price(rows: Int, seats: Int, nR: Int): Int {
    if (rows * seats <= 60) {
        return 10
    } else if (nR <= rows / 2 ) {
        return 10
    } else return 8
}

fun main() {
    var rows = 10   // Incorrect entry
    var seats = 10  // Incorrect entry
    var nR = 0      // The row number
    var nS = 0      // The seat number
    while(rows > 9) {
        println("Enter the number of rows:")
        rows = readLine()!!.toInt()
    }
    while (seats > 9) {
        println("Enter the number of seats in each row:")
        seats = readLine()!!.toInt()
    }
    val line = MutableList(seats) {"S"}
    val rs = mutableListOf<MutableList<String>>()
    repeat(rows) {
        rs.add(line.toMutableList())
    }
    // Displaying the options and achieving the order...
    do {
        println("\n\n1. Show the seats\n2. Buy a ticket\n0. Exit")
        val opt = readLine()!!
        if (opt == "1") {
            cinema(rs, rows, seats, nR, nS)
        } else if (opt == "2") {
            println("Enter a row number:")
            nR = readLine()!!.toInt()
            println("Enter a seat number in that row:")
            nS = readLine()!!.toInt()
            println("Ticket price: $" + price(rows, seats, nR))
        }
    } while (opt != "0")
}



// Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

