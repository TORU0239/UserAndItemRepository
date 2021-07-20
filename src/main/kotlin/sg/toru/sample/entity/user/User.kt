package sg.toru.sample.entity.user

data class User(
    val id: Int,
    val name: String,
    val givenName: String,
    val middleName: String,
    val mobileNumber: String,
    val address: String,
    val postalCode: String,
)