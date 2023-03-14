package com.Ibay.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Board {
    private int board_id;
    private String board_name;
    private String board_title;
    private String board_content;
    private Date board_date;
    private int board_hit;

    public Board() {

    }

    public Board(int board_id, String board_name, String board_title, String board_content, Date board_date, int board_hit) {
        this.board_id = board_id;
        this.board_name = board_name;
        this.board_title = board_title;
        this.board_content = board_content;
        this.board_date = board_date;
        this.board_hit = board_hit;
    }
}
