package com.example.boot06_article.controller;

import com.example.boot06_article.dto.ArticleDto;
import com.example.boot06_article.dto.ArticleForm;
import com.example.boot06_article.model.MemberUser;
import com.example.boot06_article.service.ArticleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.BadRequestException;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/article")
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/list-without-pagination")
    public String getArticleList(Model model) {
        model.addAttribute("articles", articleService.findAllWithoutPagination());
        return "article-list-without-pagination";
    }

    /*
    //http://localhost:8000/article/list?page=0&size=10&sort=name,asc&sort=id,desc
    @GetMapping("/list")
        public String getArticleList(@PageableDefault(page = 0, size = 10) @SortDefault.SortDefaults
            ({@SortDefault(sort = "name", direction = Sort.Direction.ASC), @SortDefault(sort = "id", direction = Sort.Direction.DESC)} )
                                     Pageable pageable, Model model) {
        model.addAttribute("page", articleService.findAll(pageable));
        return "article-list";

    }
    */

    //http://localhost:8000/article/list?page=0&size=10&sort=id,desc
    @GetMapping("/list")
    public String getArticleList(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.DESC)
                                 Pageable pageable, Model model) {
        model.addAttribute("page", articleService.findAll(pageable));
        return "article-list";

    }

    @GetMapping("/content")
    public String getArticle(@RequestParam("id") Long id
            , @RequestParam(value = "pageNumber", required = false) Long pageNumber, Model model) {
        model.addAttribute("article", articleService.findById(id));
        model.addAttribute("pageNumber", pageNumber);
        return "article-content";
    }

    @GetMapping("/add")
    public String getArticleAdd(@ModelAttribute("article") ArticleForm articleForm) {
        //articleForm.setDescription("바르고 고운말을 사용하여 주세요^^");
        return "article-add";
    }

    @PostMapping("/add")
    public String postArticleAdd(@Valid @ModelAttribute("article") ArticleForm articleForm,
                                 BindingResult bindingResult,
                                 @AuthenticationPrincipal MemberUser memberUser) {
        if (articleForm.getTitle() != null && articleForm.getTitle().contains("아주 심한 욕")) {
            bindingResult.rejectValue("title", "SlangDetected", "욕설을 사용하지 마세요");
        }
        if (articleForm.getDescription() != null && articleForm.getDescription().contains("아주 심한 욕")) {
            bindingResult.rejectValue("description", "SlangDetected", "욕설을 사용하지 마세요");
        }

        if (bindingResult.hasErrors()) {
            return "article-add";
        }

        articleService.create(memberUser.getId(), articleForm);
        return "redirect:/article/list";
    }

    /*
    @GetMapping("/edit")
    public String getArticleEdit(@RequestParam("id") Long id, Model model) {
        ArticleDto articleDto = articleService.findById(id);
        var articleForm = ArticleForm.builder()
                .id(id)
                .title(articleDto.getTitle())
                .description(articleDto.getDescription())
                .build();
        model.addAttribute("article", articleForm);
        return "article-edit";
    }
    */

    //ArticleForm 객체에는 id 필드에 전달받은 게시글 고유값만 저장
    @GetMapping("/edit")
    public String getArticleEdit(@ModelAttribute("article") ArticleForm articleForm) {
        ArticleDto articleDto = articleService.findById(articleForm.getId());
        articleForm.setId(articleDto.getId());
        articleForm.setTitle(articleDto.getTitle());
        articleForm.setDescription(articleDto.getDescription());
        return "article-edit";
    }

    @PostMapping("/edit")
    public String postArticleEdit(@Valid @ModelAttribute("article") ArticleForm articleForm,
                                  BindingResult bindingResult,
                                  @AuthenticationPrincipal MemberUser userDetails) throws BadRequestException {
        if (bindingResult.hasErrors()) {
            return "article-edit";
        }
        articleService.update(userDetails.getId(), articleForm);
        return "redirect:/article/content?id=" + articleForm.getId();
    }

    /*
    @ExceptionHandler(exception = BadRequestException.class)
    public String badRequestExceptionHandler(BadRequestException exception, Model model) {
        log.info("예외 메세지 = {}", exception.getMessage());
        model.addAttribute("errorMessage", exception.getMessage());
        return "error/error-400";
    }
    */
}



