package com.example.boot06_article.service;

import com.example.boot06_article.dto.ArticleDto;
import com.example.boot06_article.dto.ArticleForm;
import com.example.boot06_article.dto.MemberDto;
import com.example.boot06_article.dto.MemberForm;
import com.example.boot06_article.model.Article;
import com.example.boot06_article.model.Member;
import com.example.boot06_article.repository.ArticleRepository;
import com.example.boot06_article.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;
    private final MemberRepository memberRepository;

    public List<ArticleDto> findAllWithoutPagination() {
        return articleRepository.findAll().stream().map(this::mapToArticleDto).toList();
    }

    public Page<ArticleDto> findAll(Pageable pageable) {
        return articleRepository.findAll(pageable).map(this::mapToArticleDto);
    }

    public ArticleDto findById(Long id) {
        return articleRepository.findById(id).map(this::mapToArticleDto).orElseThrow();
    }

    public ArticleDto create(Long memberId, ArticleForm articleForm) {
        Member member = memberRepository.findById(memberId).orElseThrow();
        Article article = Article.builder()
                .title(articleForm.getTitle())
                .description(articleForm.getDescription())
                .member(member).build();
        articleRepository.save(article);
        return mapToArticleDto(article);
    }

    public ArticleDto update(Long memberId, ArticleForm articleForm) throws BadRequestException {
        Article article = articleRepository.findById(articleForm.getId()).orElseThrow();
        if (!article.getMember().getId().equals(memberId)) {
            throw new BadRequestException();
        }
        article.setTitle(articleForm.getTitle());
        article.setDescription(articleForm.getDescription());
        articleRepository.save(article);
        return mapToArticleDto(article);
    }

    private ArticleDto mapToArticleDto(Article article) {
        return ArticleDto.builder()
                .id(article.getId())
                .title(article.getTitle())
                .description(article.getDescription())
                .created(article.getCreated())
                .updated(article.getUpdated())
                .memberId(article.getMember().getId())
                .name(article.getMember().getName())
                .email(article.getMember().getEmail()).build();
    }
}
