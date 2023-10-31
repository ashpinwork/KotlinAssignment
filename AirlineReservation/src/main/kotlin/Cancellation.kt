import Airlines.objbook
import java.time.LocalDate

class Cancellation {
    companion object {
        fun tnc () {
            println("--------Terms & Conditions of Cancellation--------")
            println("If cancelled one week before flight, the amount wll be fully refunded")
            println("If cancelled 5 or more days before flight, the half amount wll be refunded")
            println("If cancelled 4 days or less before flight, the no amount wll be refunded")
        }
    }
    var cancelOpt: Int = 0


    fun cancelOption() {
        println("-----------------------------")
        println("Do you want to cancel your flight? (1/2)")
        cancelOpt = readln().toInt()

        if (cancelOpt == 1) {
            println("Enter your ticket number: ")
            var bookingID: String = readln()
            if (bookingID == objbook[0].bookingID) {
                println("Your booking will be cancelled")
                // check date and compare object[0].date if they are few days near

                objbook.removeAt(0)

            }
            else {
                println("enter valid booking id")
            }
        }
    }
}