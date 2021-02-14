package com.portfolio.mymall.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "board")
public class Board extends Base_Entity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    private String title;

    private String  content;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member writer_id;

}
