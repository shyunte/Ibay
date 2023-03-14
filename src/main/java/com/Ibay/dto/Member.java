package com.Ibay.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Member {
    private Long id;
    private String userId;
    private String userPassword;

    public Member(String userId, String userPassword) {
        this.userId = userId;
        this.userPassword = userPassword;
    }
}
