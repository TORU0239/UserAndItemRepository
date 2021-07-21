package sg.toru.sample.controller.payment

import sg.toru.sample.entity.payment.Payment

interface PaymentController {
    // make a transaction
    fun makeTransaction(payment: Payment)
}