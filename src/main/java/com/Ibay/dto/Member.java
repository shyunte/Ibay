package com.Ibay.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class Member {
    private String userName;
    private String userId;
    private String userPassword;
    private String userPhone;
    private Date regDate;
    private Grade grade;


    public Member(String userName, String userId, String userPassword, String userPhone,  Grade grade) {
        this.userName = userName;
        this.userId = userId;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.grade = grade;
    }
}
