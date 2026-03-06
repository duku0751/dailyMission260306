package com.example.boot06_article.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice
@Slf4j
public class ExceptionController {
    @ExceptionHandler(exception = BadRequestException.class)
    public String badRequestExceptionHandler(BadRequestException exception, Model model) {
        log.info("예외 메세지 = {}", exception.getMessage());
        model.addAttribute("errorMessage", exception.getMessage());
        return "error/error-400";
    }

    @ExceptionHandler(exception = Exception.class)
    public String exceptionHandler(Exception exception, Model model) {
        log.info("예외 메세지 = {}", exception.getMessage());
        model.addAttribute("errorMessage", exception.getMessage());
        return "error/error-400";
    }
}
