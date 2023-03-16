package com.Ibay.controller;

import com.Ibay.mapper.BoardMapper;
import com.Ibay.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReplyController {
    @Autowired
    ReplyMapper replyMapper;

}
