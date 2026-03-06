package com.example.boot06_article.repository;

import com.example.boot06_article.model.Authority;
import com.example.boot06_article.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    List<Authority> findByMember(Member member);

    @Transactional
    void deleteAllByMember(Member member);
}
