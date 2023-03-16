package com.Ibay.service;

import com.Ibay.dto.Board;
import java.util.List;

public interface BoardService {
   public List<Board> list();

    int write(String boardName, String boardTitle, String boardContent);

}
