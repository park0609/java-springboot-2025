package com.pknu.backboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pknu.backboard.entity.Member;
import com.pknu.backboard.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

    @Autowired
    private final MemberRepository memberRepository;

    public Member setMember(String username, String email, String password) {
        Member member = new Member();
        member.setUsername(username);
        member.setEmail(email);
        BCryptPasswordEncoder pwdEnc = new BCryptPasswordEncoder();
        member.setPassword(pwdEnc.encode(password)); // 암호화

        this.memberRepository.save(member);
        return member;
    }
}
