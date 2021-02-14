package com.portfolio.mymall.domain;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "reply")
public class Reply extends Base_Entity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    private Long board_seq;

    private String content;

    private String replyer;
}
