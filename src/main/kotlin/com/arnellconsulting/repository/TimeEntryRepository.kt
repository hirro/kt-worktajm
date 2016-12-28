package com.arnellconsulting.repository

import com.arnellconsulting.domain.TimeEntry
import org.springframework.data.mongodb.repository.MongoRepository

interface TimeEntryRepository:MongoRepository<TimeEntry, String> {
}