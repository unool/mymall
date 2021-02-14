package com.portfolio.mymall.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "member")
public class Member extends Base_Entity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    private Long seq;

    @Column(name = "id", unique = true)
    private String id;

    @Column(name = "pwd")
    private String password;

    @Column(name = "nick")
    private String nick;

    @Column(name = "base_address")
    private String base;

    @Column(name = "detail_address")
    private String detail;

    @Column(name = "phone_number")
    private String phone;
}
