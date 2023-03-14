package com.Ibay.controller;

import com.Ibay.dto.Member;
import com.Ibay.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MemberService memberService;

    @RequestMapping("/")
    @ResponseBody
    public String root() {
        return "root()함수 호출";
    }

    @RequestMapping("/listForm")
    public String listForm() {
        return "listForm";      //listform.html으로 디스패치해줌
    }

    @GetMapping("/members")
    public List<Member> getUser(){
        return memberService.getUserList();
    }


}
