package sg.toru.sample.controller.payment

import sg.toru.sample.entity.payment.PaymentMethod

interface PaymentController {
    // make a transaction
    fun makeTransaction(payment: PaymentMethod)
}