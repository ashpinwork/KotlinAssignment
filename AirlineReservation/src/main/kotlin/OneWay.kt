import Airlines.objbook
import java.io.File

class OneWay: Booking(), Billing  {
    override fun payBill() {
        var cd = CustomerDetails()
        var total = 0f
        var p = Payment()
        var oneWayFile = File("oneWayBooking.txt")


        oneWayFile.createNewFile()
        total = oneWayBooking()

        var billedAmount = total.billTotal()
        oneWayFile.writeText("\n------------Bill Details-------------")
        oneWayFile.appendText("\nBooking ID: ${objbook[0].bookingID} \n${objbook[0].flightName}  at ${objbook[0].flightTiming} on ${objbook[0].date}")
        oneWayFile.appendText( "\nTotal amount: ${objbook[0].price}x${objbook[0].numOfPeople} =${objbook[0].numOfPeople*objbook[0].price}")
        oneWayFile.appendText("\nBilled amount after tax: ${billedAmount}")

        var data = oneWayFile.readText()
        println(data)

        cd.details()
        println("Select mode of payment")
        var miles = p.displayOptions(oneWayFile)
        billedAmount.calcMiles(miles)
        oneWayFile.appendText("\nMiles obtained on this booking $billedAmount * $miles = ${billedAmount.calcMiles(miles)}")



    }
}

fun Float.billTotal(): Float {
    var tax = 0.15f
    return (this + this * (tax))
}


fun Float.calcMiles(m: Float): Float {
    return (this*m)
}