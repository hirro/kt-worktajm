package com.arnellconsulting.web

import com.arnellconsulting.domain.User
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    /**
     * Get information about currently logged in user.
     */
    @RequestMapping("/api/users/me", method = arrayOf(RequestMethod.GET))
    fun list(): User {
        return User(name = "Jim Arnell", email = "jim@arnellconsulting.com")
    }


}