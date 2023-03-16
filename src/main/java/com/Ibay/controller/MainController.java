package com.Ibay.controller;

import com.Ibay.dto.Board;
import com.Ibay.dto.Reply;
import com.Ibay.mapper.BoardMapper;
import com.Ibay.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    BoardMapper boardMapper;
    @Autowired
    ReplyMapper replyMapper;

//    @RequestMapping("listForm")
//    public String listForm(Model model) {
//        List<Board> list = boardMapper.list();
//        model.addAttribute("list", list);
//        System.out.println("list Form = "+ list);
//        return "listForm";   //listform.html으로 디스패치해줌
//    }
//
//    @RequestMapping("writeForm")
//    public String writeForm(){
//        return "writeForm"; //writeForm을 디스패치함
//    }

    @RequestMapping("writeAction")
    @ResponseBody
    public String writeAction(@RequestParam("board_name") String board_name,
                              @RequestParam("board_title") String board_title,
                              @RequestParam("board_content") String board_content) {

        int result = boardMapper.write(board_name, board_title, board_content);
        if (result == 1) {
            System.out.println("글쓰기 성공");
            return "<script>alert('글쓰기 성공!'); location.href='/listForm';</script>";
        } else {
            System.out.println("실패");
        }
        return "<script>alert('글쓰기 실패!'); location.href='/writeForm';</script>";
    }

    @RequestMapping("contentForm")
    public String contentForm(@RequestParam("board_id") String board_id,
                              Model model,
                              HttpServletRequest request){
        //조회수
        boardMapper.hit(board_id);

        //게시글 보기
        Board board = boardMapper.view(board_id);

        model.addAttribute("board", board);

        //댓글리스트 가져오기
        List<Reply> reply_list = replyMapper.reply_list(board_id);
        model.addAttribute("reply_list", reply_list);

        return "contentForm";
    }

    @RequestMapping("updateAction")
    @ResponseBody
    public String updateAction(@RequestParam("board_id") String board_id,
                               @RequestParam("board_name") String board_name,
                               @RequestParam("board_title") String board_title,
                               @RequestParam("board_content") String board_content,
                               HttpServletRequest request
                               ){

        int result = boardMapper.update(board_id, board_name, board_title, board_content);
        if (result == 1) {
            System.out.println("글 수정 성공");
           return "<script>alert('글쓰기 성공!'); location.href='/listForm';</script>";
        } else {
            System.out.println("글 수정 실패");
            return "<script>alert('글쓰기 실패!'); location.href='/contentForm?board_id=" + board_id+ "';</script>";         // updateform으로 리다이렉트
        }

    }

    @RequestMapping("deleteAction")
    @ResponseBody
    public String deleteAction(@RequestParam("board_id") String board_id,
                               HttpServletRequest request){
        int result = boardMapper.delete(board_id);

        if (result == 1) {
            System.out.println("글 삭제 성공");
            return "<script>alert('글 삭제 성공!'); location.href='/listForm';</script>";
        } else {
            System.out.println("글 삭제실패");
            return "<script>alert('삭제 실패!'); location.href='/contentForm?board_id=" + board_id+ "';</script>";      //updateform으로 리다이렉트
        }

    }

    @RequestMapping("writeReplyAction")
    @ResponseBody
    public String writeReplyAction(
                                   @RequestParam("reply_name") String reply_name,
                                   @RequestParam("reply_content") String reply_content,
                                   @RequestParam("reply_board_id") String reply_board_id,
                                   HttpServletRequest request) {

        int result = replyMapper.reply_write(reply_name, reply_content,reply_board_id);
        if (result == 1) {
            System.out.println("댓글달기  성공");
            return "<script>alert('댓글달기 성공!');  location.href='/contentForm?board_id=" + reply_board_id+ "';</script>";
        } else {
            System.out.println("실패");
            return "<script>alert('댓글달기 실패!'); location.href='/contentForm?board_id=" + reply_board_id+ "';</script>";
        }
    }

}
