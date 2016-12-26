package com.arnellconsulting.web

import com.arnellconsulting.domain.Project
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class ProjectController {

    /**
     * Return all projects owned by currently logged in user.
     */
    @RequestMapping("/api/projects", method = arrayOf(RequestMethod.GET))
    fun list(): Array<Project> {
        return arrayOf()
    }


}