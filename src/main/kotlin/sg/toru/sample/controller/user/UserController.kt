package sg.toru.sample.controller.user

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import sg.toru.sample.entity.user.User

/*
*  REST API Controller Interface for User
*/

interface UserController {
    fun createUser(user: User): User
    fun getUsers(): List<User>
    fun getUser(@PathVariable id: Int): User?
    fun updateUser(@RequestBody user: User): User
    fun deleteUser(@RequestBody user: User): User
}