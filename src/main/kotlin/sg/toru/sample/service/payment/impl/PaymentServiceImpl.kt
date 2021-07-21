package sg.toru.sample.service.payment.impl

import org.springframework.stereotype.Service
import sg.toru.sample.entity.payment.Payment
import sg.toru.sample.service.payment.PaymentService

/*
*  CRUD Service for Payment
*/

@Service
class PaymentServiceImpl: PaymentService {
    override fun makeTransaction(payment: Payment) {
        TODO("Not yet implemented")
    }
}