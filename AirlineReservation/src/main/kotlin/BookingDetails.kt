import java.time.LocalDate

data class BookingDetails(
    val bookingID: String,
    val flightName: String,
    val flightTiming: String,
    val price: Float,
    val date: LocalDate,
    val returnDate: LocalDate?,
    val numOfPeople: Float,
    val returnFlightName: String?,
    val returnflightTiming: String?,
    val returnPrice: Float?,

    )
