package com.arnellconsulting.web

import com.arnellconsulting.domain.TimeEntry
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class TimeEntryController {

    private val logger = LoggerFactory.getLogger(TimeEntryController::class.java)

    /**
     * Create time entry (belonging to currently logged in user).
     */
    @RequestMapping("/api/timeEntries", method = arrayOf(RequestMethod.POST))
    fun create() {
        logger.info("REST create")
    }

    /**
     * Read time entry (belonging to currently logged in user).
     */
    @RequestMapping("/api/timeEntries/{id}", method = arrayOf(RequestMethod.GET))
    fun read(@PathVariable id: String) {
        logger.info("REST read")
    }

    /**
     * Update time entry (belonging to currently logged in user).
     */
    @RequestMapping("/api/timeEntries/{id}", method = arrayOf(RequestMethod.PUT))
    fun update(@PathVariable id: String) {
        logger.info("REST update(id:[{}]", id)
    }

    /**
     * Delete time entry (belonging to currently logged in user).
     */
    @RequestMapping("/api/timeEntries/{id}", method = arrayOf(RequestMethod.DELETE))
    fun delete(@PathVariable id: String) {
        logger.info("REST delete(id:[{}]", id)
    }

    /**
     * List time entries for currently logged in user.
     */
    @RequestMapping("/api/timeEntries", method = arrayOf(RequestMethod.GET))
    fun list(): Array<TimeEntry> {
        logger.info("REST list")
        return arrayOf(
                TimeEntry(
                        id ="1234",
                        createdAt = LocalDateTime.now(),
                        updatedAt = LocalDateTime.now(),
                        startTime = LocalDateTime.now(),
                        endTime = LocalDateTime.now(),
                        projectId = "123",
                        createdBy = "123")
        )
    }

}
