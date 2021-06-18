package com.example.mongotest.domain.member

import org.springframework.data.mongodb.core.mapping.Document

@Document(value = "member")
data class Member(
    val name: String,
    val gender: Gender
)
