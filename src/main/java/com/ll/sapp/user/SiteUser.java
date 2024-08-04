package com.ll.sapp.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SiteUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //JPA에서 기본키의 값을 자동으로 생성하기 위해 사용
    private long id;

    @Column(unique = true) //DB에 중복 방지
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
}
