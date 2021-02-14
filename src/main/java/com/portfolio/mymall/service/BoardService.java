package com.portfolio.mymall.service;

import com.portfolio.mymall.domain.Board;
import com.portfolio.mymall.domain.Member;
import com.portfolio.mymall.dto.BoardDTO;
import com.portfolio.mymall.dto.PageRequestDTO;
import com.portfolio.mymall.dto.PageResultDTO;

public interface BoardService {

    public PageResultDTO<BoardDTO> getList(PageRequestDTO pageRequestDTO);

}
