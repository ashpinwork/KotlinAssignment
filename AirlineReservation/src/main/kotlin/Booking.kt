open class Booking {

    companion object {
        fun welcome() {
            println("-----------------------\n")
            println("\n Welcome to Bengaluru Airport\n")
            println("-----------------------\n")
        }
    }

    var opt = 0
    var destination: String = ""
    var origin: String = ""
    var a = Airlines

    fun enterSelection() {
        var ow = OneWay()
        var tw = TwoWay()
        println("One way (1)/ Two way (2)")
        opt = readln().toInt()

        val check: (Int) -> Unit = { n: Int ->
            when(n) {
                1 -> ow.payBill()
                2 -> tw.payBill()
                else -> throw ErrorException("Invalid Entry")
            }
        }
        check.invoke(opt)
    }

    fun oneWayBooking(): Float {
        println("Origin:")
        origin = readln()
        println("Destination (Enter Par/Tex for Paris or Texas):")
        destination = readln()

        return (a.displayMenu(destination))
    }

    fun twoWayBooking(): Float{
        println("Origin:")
        origin = readln()
        println("Destination:")
        destination = readln()

        return (a.displayMenuReturn(destination))
    }
}