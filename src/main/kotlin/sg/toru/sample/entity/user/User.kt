package sg.toru.sample.entity.user

import sg.toru.sample.entity.payment.Payment
import sg.toru.sample.entity.user.transaction.Transaction


/*
* User's fundamental information and payment methods registered.
* */
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

    val paymentMethods: Set<Payment> = setOf(),
    val transactionHistory: List<Transaction> = listOf(),
)