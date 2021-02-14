package com.portfolio.mymall.controller;

import com.portfolio.mymall.dto.PageRequestDTO;
import com.portfolio.mymall.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    BoardService boardService;
    Logger logger;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
        this.logger = LoggerFactory.getLogger(HomeController.class);
    }

    @GetMapping("/list")
    public void list(PageRequestDTO pageRequestDTO, Model model)
    {
        boardService.getList(pageRequestDTO);
    }


}

