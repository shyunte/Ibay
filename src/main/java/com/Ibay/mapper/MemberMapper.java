package com.Ibay.mapper;

import com.Ibay.dto.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<Member> getUserList();
}
