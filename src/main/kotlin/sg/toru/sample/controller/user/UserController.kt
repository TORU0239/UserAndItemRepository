package sg.toru.sample.controller.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import sg.toru.sample.entity.user.User
import sg.toru.sample.service.user.impl.UserServiceImpl

/*
*  REST API Controller for User
*/

@RestController
@RequestMapping("/api/v1/users")
class UserController constructor(
    @Autowired private val service: UserServiceImpl
) {
    fun createUser(user: User): User {
        return service.createUser(user)
    }

    @GetMapping
    fun getUsers(): List<User> {
        return service.getUsers()
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Int): User? {
        return service.getUser(id)
    }

    @PutMapping
    fun updateUser(@RequestBody user: User): User {
        return service.updateUser(user)
    }

    @DeleteMapping
    fun deleteUser(@RequestBody user: User): User {
        return service.deleteUser(user)
    }
}