package com.Ibay.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Reply {
    private int reply_id;
    private String reply_name;
    private String reply_content;
    private Date reply_date;
    private int reply_board_id;

    public Reply() {
    }

    public Reply(int reply_id, String reply_name, String reply_content, Date reply_date, int reply_board_id) {
        this.reply_id = reply_id;
        this.reply_name = reply_name;
        this.reply_content = reply_content;
        this.reply_date = reply_date;
        this.reply_board_id = reply_board_id;
    }
}
