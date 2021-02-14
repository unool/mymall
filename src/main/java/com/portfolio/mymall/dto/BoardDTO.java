package com.portfolio.mymall.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
public class BoardDTO {

    private Long seq;

    private String title;

    private String content;

    private String writer_id;

    private LocalDateTime regDate;

    private LocalDateTime modDate;

    private int replyCount;

}