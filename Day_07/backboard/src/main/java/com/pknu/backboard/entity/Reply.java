package com.pknu.backboard.entity;

import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

// Java에 동일한 패키지에서 Import가 많이 추가되면 *(전체)로 생략가능
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
public class Reply {

    @Id // PK -> SpringBoot에서 만드는 Entity는 PK가 없으면 입력이 안됨
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long rno;

    @Column(length = 1000)
    private String content;

    @CreatedDate
    @Column(updatable = false) // 한번 작성 후 수정하지 않음
    private LocalDateTime createDate; // 게시글 작성일

    @LastModifiedDate
    private LocalDateTime modifyDate; // 게시글 수정일

    // ERD N:1로 관계성립
    @ManyToOne
    private Board board; // 얘는 board한건으로 작동하니 board만 있으면 된다
}
