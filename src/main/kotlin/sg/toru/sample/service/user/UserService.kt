package sg.toru.sample.service.user

import org.springframework.stereotype.Service
import sg.toru.sample.entity.user.User

/*
*  CRUD Service for User
*/

@Service
class UserService {
    fun createUser(user: User): User {
        return user
    }

    fun getUser(id: Int): User? {
        return User(
            id = 0,
            name = "", givenName = "", middleName = "",
            mobileNumber = "",
            address = "", postalCode = ""
        )
    }

    fun getUsers(): List<User> {
        return listOf(
            User(
                id = 0,
                name = "", givenName = "", middleName = "",
                mobileNumber = "",
                address = "", postalCode = ""
            )
        )
    }

    fun updateUser(user: User): User {
        return user
    }

    fun deleteUser(user: User): User {
        return user
    }
}