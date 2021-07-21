package sg.toru.sample.entity.payment.card

data class CreditCard(
    val cardNumber: String,
    val vanCompany: CreditCardVanCompany,
    val cvv: String,
    val expiryYear: String,
    val expiryMonth: String,
)

enum class CreditCardVanCompany {
    MASTER,
    VISA,
}
