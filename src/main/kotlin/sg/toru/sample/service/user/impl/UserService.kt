package sg.toru.sample.service.user.impl

import sg.toru.sample.entity.user.User

interface UserService {
    fun createUser(user: User): User
    fun getUser(id: Int): User?
    fun getUsers(): List<User>
    fun updateUser(user: User): User
    fun deleteUser(user: User): User
}