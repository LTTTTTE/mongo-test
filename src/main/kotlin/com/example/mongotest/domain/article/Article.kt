package com.example.mongotest.domain.article

import com.example.mongotest.domain.member.Member
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document(value = "article")
class Article(
    val member: Member,
    val title: String,
    val content: String,
    val location: Location,
    val time: LocalDateTime,
    val tag: List<Tag>
)
