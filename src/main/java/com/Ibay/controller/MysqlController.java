package com.Ibay.controller;

import com.Ibay.service.MysqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MysqlController {

    @Autowired
    private MysqlService mysqlService;

    @RequestMapping("/login")
    private String getMemberInfo() {
        return this.mysqlService.getMemberInfo();
    }
}
