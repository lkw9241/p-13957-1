package com.back.domain.post.post.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // 아래 구조대로 DB 테이블을 만들어야 한다.
@Getter
@Setter
@ToString //toString 안붙이면 객체 리모컨의 정보가 나옴.
@NoArgsConstructor
public class Post {
    @Id // PRIMARY KEY
    @GeneratedValue(strategy =  IDENTITY) // AUTO_INCREMENT
    private int id; // INT
    private String title=""; // VARCHAR(255)
    @Column(columnDefinition = "TEXT")
    private String content;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;//final을 붙여서 초기화 해야한다.
    }

}
