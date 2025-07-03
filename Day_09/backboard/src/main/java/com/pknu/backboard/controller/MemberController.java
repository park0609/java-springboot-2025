package com.pknu.backboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pknu.backboard.service.MemberService;
import com.pknu.backboard.validation.MemberForm;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private final MemberService memberService;

    @GetMapping("/signup")
    public String getSignup(MemberForm memberForm) {
        return "signup"; // signup.html 생성
    }

    @PostMapping("/signup")
    public String setSignup(@Valid MemberForm memberForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "signup";
        }

        // 패스워드와 패스워드확인이 일치하지 않으면
        if (!memberForm.getPassword1().equals(memberForm.getPassword2())) {
            bindingResult.rejectValue("password2", "passwordIncorrect", "패스워드가 일치하지 않습니다.");

            return "signup";
        }
        this.memberService.setMember(memberForm.getUsername(), memberForm.getUsername(), memberForm.getPassword1());
        return "redirect:/";
    }

}
