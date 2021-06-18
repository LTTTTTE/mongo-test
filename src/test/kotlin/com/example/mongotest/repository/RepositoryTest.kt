package com.example.mongotest.repository

import com.example.mongotest.domain.article.Article
import com.example.mongotest.domain.article.Location
import com.example.mongotest.domain.article.Tag.*
import com.example.mongotest.domain.member.Gender
import com.example.mongotest.domain.member.Member
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime

@SpringBootTest
internal class RepositoryTest {
    @Autowired
    lateinit var repository: ArticleRepository

    @Test
    fun saveTest() {
        val article = Article(
            Member("김갑생", Gender.MALE),
            "제목",
            "내용",
            Location("127.978462", "37.663998"),
            LocalDateTime.now(),
            listOf(INFORMATION, PUBLIC, NOTICE)
        )
        assertDoesNotThrow { repository.save(article) }
    }
}