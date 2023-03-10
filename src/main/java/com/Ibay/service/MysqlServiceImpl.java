package com.Ibay.service;

import com.Ibay.MysqlDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class MysqlServiceImpl implements MysqlService{

    @Autowired
    private MysqlDao mysqlDao;

    @Override
    public String getMemberInfo() {
        log.info("mysql :: getMemberInfo");
        return this.mysqlDao.getMemberInfo();
    }
}
