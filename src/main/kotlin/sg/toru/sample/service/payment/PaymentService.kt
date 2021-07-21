package sg.toru.sample.service.payment

import sg.toru.sample.entity.payment.PaymentMethod

interface PaymentService {
    // make a transaction
    fun makeTransaction(payment:PaymentMethod)
}