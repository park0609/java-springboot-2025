package com.pknu.backboard.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter // Lombok으로 getter, setter 자동화
@Entity // JPA 테이블 매핑 선언
public class Board {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long bno; // Board 테이블의 PK, bno

    // @Column(name = "subject", length = 250) 이름바꾸고싶으면
    @Column(length = 250)
    private String title; // 게시판 제목

    @Column(length = 4000)
    private String content; // 게시글 내용

    @CreateDate
    @Column(updatable = false) // 한번 작성 후 수정하지 않음
    private LocalDateTime createDate; // 게시글 작성일

    @LastModifiedDate
    private LocalDateTime modifyDate; // 게시글 수정일

}
