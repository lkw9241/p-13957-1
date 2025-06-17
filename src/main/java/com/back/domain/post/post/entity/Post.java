package com.back.domain.post.post.entity;

// JPA에서 사용하는 어노테이션들과 롬복(Lombok) 라이브러리 import
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity // 이 클래스를 DB의 테이블로 사용하겠다는 뜻. 클래스명이 테이블 이름이 됨.
@Getter // 롬복: 모든 필드에 대해 Getter 메서드 자동 생성
@Setter // 롬복: 모든 필드에 대해 Setter 메서드 자동 생성
@ToString // 롬복: toString() 메서드 자동 생성 (객체 내용 출력용)
@NoArgsConstructor // 롬복: 파라미터 없는 기본 생성자 자동 생성
public class Post {
    //Post 엔티티 클래스의 필드들이며, JPA에서는 이 필드들이 곧 데이터베이스 테이블의 칼럼
    @Id // 이 필드를 테이블의 기본 키(PK)로 설정
    @GeneratedValue(strategy = IDENTITY) // DB가 자동으로 번호 증가(AUTO_INCREMENT) 하도록 설정
    private int id; // 글 번호 (INT)

    private LocalDateTime createDate; // 글 생성일시
    private LocalDateTime modifyDate; // 글 수정일시

    private String title; // 글 제목 (기본 길이 VARCHAR(255))

    @Column(columnDefinition = "TEXT") // DB에서 'content' 필드는 TEXT 타입으로 저장
    private String content; // 글 내용

    // 제목과 내용을 받는 생성자. 생성 시 시간도 같이 세팅됨.
    public Post(String title, String content) {
        this.createDate = LocalDateTime.now(); // 생성일은 현재 시간으로 설정
        this.modifyDate = this.createDate; // 수정일도 처음엔 생성일과 동일
        this.title = title; // 전달받은 제목 설정
        this.content = content; // 전달받은 내용 설정
    }

}
