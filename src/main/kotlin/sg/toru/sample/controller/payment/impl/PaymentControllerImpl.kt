package sg.toru.sample.controller.payment.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import sg.toru.sample.controller.payment.PaymentController
import sg.toru.sample.entity.payment.PaymentMethod
import sg.toru.sample.service.payment.PaymentService

@RestController
@RequestMapping("api/v1/payment")
class PaymentControllerImpl constructor(
    @Autowired private val paymentService: PaymentService
): PaymentController
{

    override fun makeTransaction(payment: PaymentMethod) {
        paymentService.makeTransaction(payment)
    }
}