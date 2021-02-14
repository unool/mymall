package com.portfolio.mymall.domain;

import lombok.Getter;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass //클래스가 만들어지지 않는 기초 클래스라는 어노테이션
@Getter
abstract class Base_Entity {
    @Column(name = "reg_date", updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    @Column(name = "mod_date")
    private LocalDateTime modDate;

}
