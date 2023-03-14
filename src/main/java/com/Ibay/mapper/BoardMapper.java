package com.Ibay.mapper;

import com.Ibay.dto.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface BoardMapper {

    public int write(String boardName, String boardName1, String boardContent);

    public List<Board> list();
}
