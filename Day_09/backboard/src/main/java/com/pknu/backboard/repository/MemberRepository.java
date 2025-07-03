package com.pknu.backboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pknu.backboard.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // 아무 내용 필요없음
}
