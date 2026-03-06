package com.example.boot06_article.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberForm {
    private Long id;
    @NotBlank(message = "이름을 입력하세요")
    private String name;
    @NotBlank(message = "이메일을 입력하세요")
    @Email(message = "이메일 형식이 잘못 되었습니다")
    private String email;
    @Size(min = 8, message = "패스워드를 8글자 이상 입력하세요")
    private String password;
    private String passwordConfirm;
}