package sg.toru.sample.entity.payment

import sg.toru.sample.entity.payment.card.CreditCard
import sg.toru.sample.entity.payment.fundtransfer.FundTransfer

data class Payment(
    val id: String,
    val paymentMethod: PaymentMethods = PaymentMethods.NotSetup,
    val paymentCreditCard: CreditCard? = null,
    val paymentFundTransfer: FundTransfer? = null,
)

enum class PaymentMethods {
    NotSetup,
    CreditCard,
    FundTransfer,
}