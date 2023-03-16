package com.Ibay.service.Impl;

import com.Ibay.dto.Board;
import com.Ibay.mapper.BoardMapper;
import com.Ibay.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public List<Board> list() {
        return boardMapper.list();
    }

    @Override
    public int write(String boardName, String boardTitle, String boardContent) {
        return 0;
    }

}
