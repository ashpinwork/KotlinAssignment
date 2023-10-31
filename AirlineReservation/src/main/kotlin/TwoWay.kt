import Airlines.objbook
import java.io.File

class TwoWay: Billing, Booking() {
    var tax = 0.15f

    override fun payBill() {
        var cd = CustomerDetails()
        var total = 0f
        var p = Payment()
        var twoWayFile = File("twoWayBooking.txt")

        total = twoWayBooking()
        var billedAmount = objbook[0].numOfPeople*(objbook[0].price+ objbook[0].returnPrice!!)

        twoWayFile.createNewFile()
        twoWayFile.writeText("\n------------Bill Details-------------")
        twoWayFile.appendText("\nBooking ID: ${objbook[0].bookingID} \n${objbook[0].flightName} at ${objbook[0].flightTiming} on ${objbook[0].date}")
        twoWayFile.appendText( "\nTotal Amount: ${objbook[0].price}x${objbook[0].numOfPeople} = ${objbook[0].numOfPeople* objbook[0].price}")


        twoWayFile.appendText("\n-Return Booking- \n${objbook[0].returnFlightName} at ${objbook[0].flightTiming} on ${objbook[0].returnDate}")
        twoWayFile.appendText( "\nTotal Amount: ${objbook[0].returnPrice}x${objbook[0].numOfPeople} = ${objbook[0].numOfPeople* objbook[0].returnPrice!!}")

        twoWayFile.appendText("\nBilled amount after tax: ${billedAmount.billTotal()}")

        var data = twoWayFile.readText()
        println(data)

        cd.details()
        println("Select mode of payement")

        var miles = p.displayOptions(twoWayFile)
        billedAmount.calcMiles(miles)
        twoWayFile.appendText("\nMiles obtained on this booking $billedAmount * $miles = ${billedAmount.calcMiles(miles)}")

    }
}