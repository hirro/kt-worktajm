package com.arnellconsulting.domain

import java.io.Serializable
import java.time.LocalDateTime

data class Project(val createdAt: LocalDateTime, val updatedAt: LocalDateTime, val name: String, val createdBy: User) : Serializable
