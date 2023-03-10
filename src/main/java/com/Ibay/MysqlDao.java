package com.Ibay;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MysqlDao {

    String getMemberInfo();
}
