package com.Ibay.mapper;

import com.Ibay.dto.Reply;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {
    public List<Reply> reply_list(String reply_board_id);

    public int reply_write(String reply_name, String reply_content, String reply_board);

    public int reply_delete(String reply_id);

    void reply_write(Reply reply);

    Object getList(Reply reply);
}
