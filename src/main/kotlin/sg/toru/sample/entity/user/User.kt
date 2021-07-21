package sg.toru.sample.entity.user

import sg.toru.sample.entity.payment.PaymentMethod
import sg.toru.sample.entity.user.transaction.Transaction


/*
* User's fundamental information and payment methods registered.
* */
data class User(
    val id: Long,
    var name: String,
    var givenName: String,
    var middleName: String,
    var mobileNumber: String,
    var address: String,
    var postalCode: String,
    var password: String,
    var isPhoneVerificationNeeded: Boolean = true,

    var paymentMethods: Set<PaymentMethod> = setOf(),
    var transactionHistory: List<Transaction> = listOf(),
)