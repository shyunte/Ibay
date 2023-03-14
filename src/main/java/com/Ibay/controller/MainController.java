package com.Ibay.controller;

import com.Ibay.dto.Board;
import com.Ibay.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    BoardMapper boardMapper;

    @RequestMapping("/")
//    @ResponseBody
    public String root() {

        //return "root()함수 호출";
        System.out.println("redirect 됐음");
        return "redirect:listForm";   //listtFirm으로 리다이렉트
    }

    @RequestMapping("listForm")
    public String listForm(Model model) {
        List<Board> list = boardMapper.list();
        model.addAttribute("list", list);
        System.out.println( list);
        return "listForm";   //listform.html으로 디스패치해줌
    }
    
    @RequestMapping("writeForm")
    public String writeForm(){
        return "writeForm"; //writeForm을 디스패치함
    }

    @RequestMapping("writeAction")
    public String writeAction(@RequestParam("board_name") String board_name,
                              @RequestParam("board_title") String board_title,
                              @RequestParam("board_content") String board_content)
                               {
                   int result =  boardMapper.write(board_name, board_name, board_content);
                   if (result == 1){
                       System.out.println("성공");
                   }else{
                       System.out.println("실패");
                   }
        return "redirect:listForm";
    }

}
