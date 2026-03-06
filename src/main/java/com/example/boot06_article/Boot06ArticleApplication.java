package com.example.boot06_article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Boot06ArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot06ArticleApplication.class, args);
    }

}
