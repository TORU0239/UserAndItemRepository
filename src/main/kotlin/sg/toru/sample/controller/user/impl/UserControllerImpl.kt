package sg.toru.sample.controller.user.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import sg.toru.sample.controller.user.UserController
import sg.toru.sample.entity.user.User
import sg.toru.sample.service.user.impl.UserServiceImpl

/*
*  REST API Controller for User
*/

@RestController
@RequestMapping("/api/v1/users")
class UserControllerImpl constructor(
    @Autowired private val service: UserServiceImpl
): UserController {
    override fun createUser(user: User): User {
        return service.createUser(user)
    }

    @GetMapping
    override fun getUsers(): List<User> {
        return service.getUsers()
    }

    @GetMapping("/{id}")
    override fun getUser(@PathVariable id: Int): User? {
        return service.getUser(id)
    }

    @PutMapping
    override fun updateUser(@RequestBody user: User): User {
        return service.updateUser(user)
    }

    @DeleteMapping
    override fun deleteUser(@RequestBody user: User): User {
        return service.deleteUser(user)
    }
}