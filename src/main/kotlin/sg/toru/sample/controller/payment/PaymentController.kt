package sg.toru.sample.controller.payment

import sg.toru.sample.entity.payment.Payment
import sg.toru.sample.service.payment.PaymentService

interface PaymentController {
    fun registerPayment(
        userId: Long,
        paymentService: PaymentService
    )
    // deregister payment method
    fun deregisterPayment(userId: Long)
    // make a transaction
    fun makeTransaction(payment: Payment)
}