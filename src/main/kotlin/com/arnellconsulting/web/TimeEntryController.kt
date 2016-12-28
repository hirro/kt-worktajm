package com.arnellconsulting.web

import com.arnellconsulting.domain.TimeEntry
import com.arnellconsulting.repository.TimeEntryRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
open class TimeEntryController @Autowired constructor(val timeEntryRepository:TimeEntryRepository) {

    private val logger = LoggerFactory.getLogger(TimeEntryController::class.java)

    /**
     * Create time entry (belonging to currently logged in user).
     */
    @RequestMapping("/api/timeEntries", method = arrayOf(RequestMethod.POST))
    fun create(@RequestBody timeEntry: TimeEntry) : TimeEntry {
        logger.info("REST create")
        return timeEntryRepository.save(timeEntry)
    }

    /**
     * Read time entry (belonging to currently logged in user).
     */
    @RequestMapping("/api/timeEntries/{id}", method = arrayOf(RequestMethod.GET))
    fun read(@PathVariable id: String): TimeEntry? {
        logger.info("REST read")
        return timeEntryRepository.findOne(id)
    }

    /**
     * Update time entry (belonging to currently logged in user).
     */
    @RequestMapping("/api/timeEntries/{id}", method = arrayOf(RequestMethod.PUT))
    fun update(@PathVariable id: String, @RequestBody timeEntry: TimeEntry) : TimeEntry {
        logger.info("REST update(id:[{}]", id)
        return timeEntryRepository.save(timeEntry)
    }

    /**
     * Delete time entry (belonging to currently logged in user).
     */
    @RequestMapping("/api/timeEntries/{id}", method = arrayOf(RequestMethod.DELETE))
    fun delete(@PathVariable id: String) {
        logger.info("REST delete(id:[{}]", id)
        return timeEntryRepository.delete(id)
    }

    /**
     * List time entries for currently logged in user.
     */
    @RequestMapping("/api/timeEntries", method = arrayOf(RequestMethod.GET))
    fun list(): List<TimeEntry>? {
        logger.info("REST list")
        return timeEntryRepository.findAll()
    }

}
