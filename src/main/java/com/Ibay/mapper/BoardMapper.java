package com.Ibay.mapper;

import com.Ibay.dto.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface BoardMapper {


    public int delete(String board_id);

    public Board view(String board_id);

    public int write(String board_name, String board_title, String board_content);

     List<Board> list();

    public int update(String board_id,String board_name, String board_title, String board_content);

    public int hit(String board_id);


    //ajax
    void write(Board result);

    Object getList(Board result);
}
