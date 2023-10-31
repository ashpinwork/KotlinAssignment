import aggregation.Name
import aggregation.Address

class CustomerDetails {
    var n = Name()
    var a = Address()


    fun details() {
        println("-------Customer Details--------");
        println("\t Personal");
        println("First Name:");
        n.fName = readln();
        println("Middle Name:");
        n.mName = readln();
        println("Last Name:");
        n.lName = readln();
        println("Phone Number:");
        n.phoneNum = readln().toInt();
        println("Email ID: ");
        n.emailID = readln();
        println("\t Address");
        println("Locality: ");
        a.locality = readln();
        println("City: ");
        a.city = readln();
        println("State: ");
        a.state = readln();
        println("PinCode: ");
        a.pinCode = Integer.valueOf(readln());

        confirmDetails(n.fName, n.mName, n.lName, n.phoneNum, n.emailID, a.locality, a.city,  a.pinCode)
    }
    fun confirmDetails(
        fName: String,
        mName: String,
        lName: String,
        phoneNum: Int,
        emailID: String,
        locality: String,
        city: String,
        pinCode: Int
    ) {
        println("-------Confirmation--------");
        println("\t Personal")
        println("First Name: ${n.fName}")
        println("Middle Name:${n.mName}")
        println("Last Name:${n.lName}")
        println("Phone Number:${n.phoneNum}")
        println("Email ID: ${n.emailID}")
        println("\t Address")
        println("Locality: ${a.locality}")
        println("City: ${a.city}")
        println("State: ${a.state}")
        println("PinCode: ${a.pinCode}")
        println("-----------------------");

    }
}