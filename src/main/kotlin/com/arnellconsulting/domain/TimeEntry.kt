package com.arnellconsulting.domain

import java.io.Serializable
import java.time.LocalDateTime

data class TimeEntry(
        val id: String,
        val createdAt: LocalDateTime,
        val updatedAt: LocalDateTime,
        val startTime: LocalDateTime,
        val endTime: LocalDateTime,
        val projectId: String,
        val createdBy: String
) : Serializable

