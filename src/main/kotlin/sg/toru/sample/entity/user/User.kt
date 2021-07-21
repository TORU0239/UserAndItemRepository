package sg.toru.sample.entity.user

import sg.toru.sample.entity.payment.Payment

data class User(
    val id: Long,
    val name: String,
    val givenName: String,
    val middleName: String,
    val mobileNumber: String,
    val address: String,
    val postalCode: String,
    val password: String,
    val isPhoneVerificationNeeded: Boolean = true,
    val paymentMethod: Payment? = null
)