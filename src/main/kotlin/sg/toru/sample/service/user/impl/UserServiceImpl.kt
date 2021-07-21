package sg.toru.sample.service.user.impl

import org.springframework.stereotype.Service
import sg.toru.sample.entity.payment.PaymentMethod
import sg.toru.sample.entity.user.User
import sg.toru.sample.entity.user.transaction.Transaction
import sg.toru.sample.service.user.UserService

/*
*  CRUD Service for User
*/

@Service
class UserServiceImpl: UserService {

    private var userList:MutableSet<User> = mutableSetOf()

    override fun createUser(user: User): User {
        userList.add(user)
        return user
    }

    override fun getUser(id: Long): User? {
        return userList.firstOrNull {
            it.id == id
        }
    }

    override fun getUsers(): List<User> {
        return userList.toList()
    }

    override fun updateUser(user: User): User {
        var filteredUser = userList.firstOrNull {
            it.id == user.id
        }

        if(filteredUser == null) {
            userList.add(user)
        } else {
            filteredUser = user.copy()
            userList.add(filteredUser)
        }
        return user
    }

    override fun deleteUser(user: User): User {
        userList.remove(user)
        return user
    }

    override fun registerPayment(userId: Long, paymentMethod: PaymentMethod): Boolean {
        return false
    }

    override fun deregisterPayment(userId: Long, paymentMethod: PaymentMethod): Boolean {
        return false
    }

    override fun inquireTransactionHistoryById(userId: Long): List<Transaction> {
        return listOf()
    }
}