package sg.toru.sample.service.user

import sg.toru.sample.entity.payment.Payment
import sg.toru.sample.entity.user.User
import sg.toru.sample.entity.user.transaction.Transaction

interface UserService {
    fun createUser(user: User): User
    fun getUser(id: Long): User?
    fun getUsers(): List<User>
    fun updateUser(user: User): User
    fun deleteUser(user: User): User

    // register or deregister payment
    fun registerPayment(userId: Long, paymentMethod: Payment): Boolean
    fun deregisterPayment(userId: Long, paymentMethod: Payment): Boolean

    // inquiring the history of transaction
    fun inquireTransactionHistoryById(userId: Long): List<Transaction>
}