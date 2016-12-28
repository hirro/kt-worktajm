package com.arnellconsulting.domain

import org.springframework.data.mongodb.core.mapping.Document
import java.io.Serializable
import java.time.LocalDateTime

@Document(collection = "time_entry")
data class TimeEntry @JvmOverloads constructor(
        @Id
        val id: String,
        val createdAt: LocalDateTime = LocalDateTime.now(),
        val updatedAt: LocalDateTime = LocalDateTime.now(),
        val startTime: LocalDateTime = LocalDateTime.now(),
        val endTime: LocalDateTime = LocalDateTime.now(),
        val projectId: String = "<default>",
        val createdBy: String = "<default>"
) : Serializable

