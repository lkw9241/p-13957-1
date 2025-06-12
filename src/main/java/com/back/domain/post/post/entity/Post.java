package com.back.domain.post.post.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // 아래 구조대로 DB 테이블을 만들어야 한다.
@Getter
@Setter
public class Post {
    @Id // PRIMARY KEY
    @GeneratedValue(strategy =  IDENTITY) // AUTO_INCREMENT
    private int id; // INT
    private String title; // VARCHAR(255)
    @Column(columnDefinition = "TEXT")
    private String content;

}
