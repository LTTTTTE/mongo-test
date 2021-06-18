package com.example.mongotest.repository

import com.example.mongotest.domain.article.Article
import com.example.mongotest.domain.member.Member
import org.springframework.data.mongodb.repository.MongoRepository

interface ArticleRepository : MongoRepository<Article, String> {
    fun findByTitle(title: String): List<Article>
}

interface MemberRepository : MongoRepository<Member, String>