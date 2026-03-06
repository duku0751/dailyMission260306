package com.example.boot06_article.repository;

import com.example.boot06_article.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ArticleQueryDslRepository {
    Page<Article> queryByKeyword(String title, String description, String memberName, Pageable pageable);
}
