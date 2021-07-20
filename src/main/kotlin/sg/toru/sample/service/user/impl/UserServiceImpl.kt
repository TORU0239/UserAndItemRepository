package sg.toru.sample.service.user.impl

import org.springframework.stereotype.Service
import sg.toru.sample.entity.user.User
import sg.toru.sample.service.user.UserService

/*
*  CRUD Service for User
*/

@Service
class UserServiceImpl: UserService {

    override fun createUser(user: User): User {
        return user
    }

    override fun getUser(id: Int): User? {
        return User(
            id = 0,
            name = "", givenName = "", middleName = "",
            mobileNumber = "",
            address = "", postalCode = ""
        )
    }

    override fun getUsers(): List<User> {
        return listOf(
            User(
                id = 0,
                name = "", givenName = "", middleName = "",
                mobileNumber = "",
                address = "", postalCode = ""
            )
        )
    }

    override fun updateUser(user: User): User {
        return user
    }

    override fun deleteUser(user: User): User {
        return user
    }
}