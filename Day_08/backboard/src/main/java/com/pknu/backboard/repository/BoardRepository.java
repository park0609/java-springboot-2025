package com.pknu.backboard.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pknu.backboard.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

    Board findByTitle(String title); // 제목으로 검색.

    List<Board> findByTitleLike(String title); // 비슷한 제목으로 검색.

    Page<Board> findAll(Pageable pageable); // 페이징 가능한 findAll() 새로 생성
}
