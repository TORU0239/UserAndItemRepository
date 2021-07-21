package sg.toru.sample.entity.payment

import sg.toru.sample.entity.payment.card.CreditCardInformation
import sg.toru.sample.entity.payment.fundtransfer.FundTransferInformation

data class PaymentMethod(
    val id: Long,
    val userId: Long,
    val paymentMethod: PaymentType = PaymentType.NotSetup,
    val paymentCreditCard: CreditCardInformation? = null,
    val paymentFundTransfer: FundTransferInformation? = null,
)

enum class PaymentType {
    NotSetup,
    CreditCard,
    FundTransfer,
}