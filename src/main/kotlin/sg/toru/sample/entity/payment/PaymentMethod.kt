package sg.toru.sample.entity.payment

import sg.toru.sample.entity.payment.card.CreditCard
import sg.toru.sample.entity.payment.fundtransfer.FundTransfer

data class Payment(
    val id: String,
    val paymentMethod: PaymentMethods,
    val paymentCreditCard: CreditCard?,
    val paymentFundTransfer: FundTransfer?,
)

enum class PaymentMethods {
    CreditCard,
    FundTransfer,
}