package com.portfolio.mymall.service;

import com.portfolio.mymall.dto.BoardDTO;
import com.portfolio.mymall.dto.PageRequestDTO;
import com.portfolio.mymall.dto.PageResultDTO;
import com.portfolio.mymall.repository.BoardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
    private final BoardRepository boardRepository;


    public BoardServiceImpl(BoardRepository boardRepository)
    {
        this.boardRepository = boardRepository;
    }

    @Override
    public PageResultDTO<BoardDTO> getList(PageRequestDTO pageRequestDTO)
    {
        getDTOList();
        System.out.println(object);
        return null;

    }

    public PageResultDTO<BoardDTO> getDTOList(PageRequestDTO pageRequestDTO){

        Long boardCount = boardRepository.getBoardTotalCount(); //게시물 총 갯수
        Long pageCount = 0L; //하단에 출력할 총 페이지수
        Long firstBoardIndex = 0L;

        if(boardCount.equals(0) || pageRequestDTO.getSize() == 0)
        {
            //표시할 페이지 없음
        }
        else
        {
            Long restBoard = boardCount%pageRequestDTO.getSize();
            pageCount = restBoard == 0 ? boardCount/pageRequestDTO.getSize() : (boardCount/pageRequestDTO.getSize()) +1;
            firstBoardIndex = Long.valueOf(pageRequestDTO.getSize()) * Long.valueOf(pageRequestDTO.getPage()-1);
            boardRepository.
        }



        Object object = boardRepository.getBoardWithMemberAll(); //전체 가져오기

        if(object.equals(null))
        {

        }
        else
        {


        }


    }
}
