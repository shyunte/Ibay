package com.Ibay.service;

import com.Ibay.dto.Member;
import com.Ibay.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Override
    public List<Member> getUserList() {
        return memberMapper.getUserList();
    }
}

