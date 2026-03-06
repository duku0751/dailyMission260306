package com.example.boot06_article.repository;

import com.example.boot06_article.model.Article;
import com.example.boot06_article.model.Member;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

import static com.example.boot06_article.model.QArticle.article;

@Repository
@RequiredArgsConstructor
public class ArticleQueryDslRepositoryImpl implements ArticleQueryDslRepository {
    private final JPAQueryFactory queryFactory;

    @Override
    public Page<Article> queryByKeyword(String title, String description, String memberName, Pageable pageable){
        List<Article> content = queryFactory.selectFrom(article)
                .where(containTitle(title),
                        containDescription(description),
                        containMember(memberName))
                .offset(pageable.getOffset()) // 페이지 시작점
                .limit(pageable.getPageSize()) // 페이지 사이즈
                .fetch();
        JPAQuery<Long> count = queryFactory.select(article.count()).from(article)
                .where(containTitle(title),
                        containDescription(description),
                        containMember(memberName));
        return PageableExecutionUtils.getPage(content, pageable, () -> count.fetchOne());
    }

    private BooleanExpression containTitle(String title) {
        if(StringUtils.isEmpty(title)) return null;
        return article.title.contains(title);
    }

    private BooleanExpression containDescription(String description) {
        if(StringUtils.isEmpty(description)) return null;
        return article.description.contains(description);
    }

    private BooleanExpression containMember(String memberName) {
        if(StringUtils.isEmpty(memberName)) return null;
        return article.member.name.contains(memberName);
    }
}
