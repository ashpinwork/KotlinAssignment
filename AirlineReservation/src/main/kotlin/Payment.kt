import java.io.File

class Payment {

    fun displayOptions(file: File): Float {
        var opt = 0
        var miles = 0f
        println("--------Payment Gateway---------")
        println("0. Credit Card")
        println("1. Debit Card")
        println("2. UPI ")
        opt = readln().toInt()
        when (opt) {
            0 -> {
                miles = cardDetails(file)
            }

            1-> miles = cardDetails(file)
            2 -> miles = UPIdetails(file)
            else -> println("Error")
        }
        return miles
    }
    fun cardDetails(file: File): Float {
        var accID = 0
        var cardID = 0
        println("-------Credit Card Payment--------")
        file.appendText("\n-------Credit Card Payment--------")

        println("Enter account ID: ")
        accID = readln().toInt()

        println("Enter card ID: ")
        cardID = readln().toInt()
        println("Transaction Successful!")
        file.appendText("\nPayment received from Account ID: ${accID}")

        return 0.4f
    }
    fun UPIdetails(oneWayFile: File):Float {
        var upiNum = "0"
        println("-------Credit Card Payment--------")
        println("Enter UPI number: ")
        upiNum = readln()
        println("Transaction Successful!")
        return 0.8f
    }

}