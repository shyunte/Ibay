package com.Ibay.controller;

import com.Ibay.dto.Board;
import com.Ibay.mapper.BoardMapper;
import com.Ibay.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("list")
    public String boardList(Model model) {
        List<Board> list = boardService.list();
        model.addAttribute("list", list);
        return "listForm";
    }

    @GetMapping("form")
    public String boardForm(){
        return "writeForm";
    }

    @RequestMapping("save")
    @ResponseBody
    public String save(@RequestParam("boardName") String boardName,
                          @RequestParam("boardTitle") String boardTitle,
                          @RequestParam("boardContent") String boardContent) {

        int result = boardService.write(boardName, boardTitle, boardContent);
        if (result == 1) {
            return "<script>alert('글쓰기 성공!'); location.href='/listForm';</script>";
        }
        return "<script>alert('글쓰기 실패!'); location.href='/writeForm';</script>";

    }

}
