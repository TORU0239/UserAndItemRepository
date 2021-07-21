package sg.toru.sample.entity.payment.card

data class CreditCardInformation(
    val cardNumber: String,
    val vanType: CreditCardVanType,
    val cvv: String,
    val expiryYear: String,
    val expiryMonth: String,
)

enum class CreditCardVanType {
    MASTER,
    VISA,
}
