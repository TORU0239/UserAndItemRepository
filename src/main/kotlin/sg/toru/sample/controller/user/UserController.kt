package sg.toru.sample.controller.user

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import sg.toru.sample.entity.payment.Payment
import sg.toru.sample.entity.user.User
import sg.toru.sample.entity.user.transaction.Transaction

/*
*  REST API Controller Interface for User
*/

interface UserController {
    fun createUser(@RequestBody user: User): User
    fun getUsers(): List<User>
    fun getUser(@PathVariable id: Long): User?
    fun updateUser(@RequestBody user: User): User
    fun deleteUser(@RequestBody user: User): User

    // register or deregister payment
    fun registerPayment(userId: Long, paymentMethod: Payment): Boolean
    fun deregisterPayment(userId: Long, paymentMethod: Payment): Boolean

    // inquiring the history of transaction
    fun inquireTransactionHistoryById(userId: Long): List<Transaction>
}