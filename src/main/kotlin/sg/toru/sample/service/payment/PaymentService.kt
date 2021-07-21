package sg.toru.sample.service.payment

import sg.toru.sample.entity.payment.Payment

interface PaymentService {
    // make a transaction
    fun makeTransaction(payment:Payment)
}