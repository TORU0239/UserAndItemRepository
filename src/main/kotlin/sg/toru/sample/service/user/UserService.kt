package sg.toru.sample.service.user

import sg.toru.sample.entity.payment.PaymentMethod
import sg.toru.sample.entity.user.User
import sg.toru.sample.entity.user.transaction.Transaction

interface UserService {
    fun createUser(user: User): User
    fun getUser(id: Long): User?
    fun getUsers(): List<User>
    fun updateUser(user: User): User
    fun deleteUser(user: User): User

    // register or deregister payment
    fun registerPayment(userId: Long, paymentMethod: PaymentMethod): Boolean
    fun deregisterPayment(userId: Long, paymentMethod: PaymentMethod): Boolean

    // inquiring the history of transaction
    fun inquireTransactionHistoryById(userId: Long): List<Transaction>
}