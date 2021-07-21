package sg.toru.sample.service.user.impl

import org.springframework.stereotype.Service
import sg.toru.sample.entity.payment.Payment
import sg.toru.sample.entity.user.User
import sg.toru.sample.entity.user.transaction.Transaction
import sg.toru.sample.service.user.UserService

/*
*  CRUD Service for User
*/

@Service
class UserServiceImpl: UserService {

    override fun createUser(user: User): User {
        // TODO: create a user in the real device
        return user
    }

    override fun getUser(id: Long): User? {
        return User(
            id = 0,
            name = "", givenName = "", middleName = "",
            mobileNumber = "",
            address = "", postalCode = "",
            password = "",
        )
    }

    override fun getUsers(): List<User> {
        return listOf(
            User(
                id = 0,
                name = "", givenName = "", middleName = "",
                mobileNumber = "",
                address = "", postalCode = "",
                password = "",
            )
        )
    }

    override fun updateUser(user: User): User {
        return user
    }

    override fun deleteUser(user: User): User {
        return user
    }

    override fun registerPayment(userId: Long, paymentMethod: Payment): Boolean {
        return false
    }

    override fun deregisterPayment(userId: Long, paymentMethod: Payment): Boolean {
        return false
    }

    override fun inquireTransactionHistoryById(userId: Long): List<Transaction> {
        return listOf()
    }
}