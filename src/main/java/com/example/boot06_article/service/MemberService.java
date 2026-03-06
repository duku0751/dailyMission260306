package com.example.boot06_article.service;

import com.example.boot06_article.dto.MemberDto;
import com.example.boot06_article.dto.MemberForm;
import com.example.boot06_article.model.Authority;
import com.example.boot06_article.model.Member;
import com.example.boot06_article.repository.AuthorityRepository;
import com.example.boot06_article.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthorityRepository authorityRepository;

    @Transactional
    public MemberDto create(MemberForm memberForm) {
        Member member =  Member.builder()
                .name(memberForm.getName())
                .password(passwordEncoder.encode(memberForm.getPassword()))
                .email(memberForm.getEmail()).build();
        Member saveMember = memberRepository.save(member);
        authorityRepository.save(Authority.builder().member(saveMember).authority("ROLE_USER").build());
        return mapToMemberDto(member);
    }

    public Optional<MemberDto> findByEmail(String email) {
        return memberRepository.findByEmail(email).map(this::mapToMemberDto);
    }

    public boolean checkPassword(Long id, String password) {
        Member member = memberRepository.findById(id).orElseThrow();
        return passwordEncoder.matches(password, member.getPassword());
    }

    public void updatePassword(Long id, String password) {
        Member member = memberRepository.findById(id).orElseThrow();
        member.setPassword(passwordEncoder.encode(password));
        memberRepository.save(member);
    }

    public MemberDto findById(Long id) {
        return memberRepository.findById(id).map(this::mapToMemberDto).orElseThrow();
    }

    private MemberDto mapToMemberDto(Member member) {
        return MemberDto.builder()
                .id(member.getId())
                .name(member.getName())
                .email(member.getEmail())
                .build();
    }
}
