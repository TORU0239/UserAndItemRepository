package sg.toru.sample.service.payment

import sg.toru.sample.entity.payment.Payment

interface PaymentService {
    // register payment method
    fun registerPayment(
        userId: Long,
        paymentService: PaymentService
    )
    // deregister payment method
    fun deregisterPayment(userId: Long)
    // make a transaction
    fun makeTransaction(payment:Payment)
}