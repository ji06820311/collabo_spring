package com.coffee.repository;

import com.coffee.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// 회원 정보들을 이용하여 데이터베스와 교신하는 인터페이스입니다.
// 이전의 Dao 역할
// JpaRepository<엔터티이름, 해당엔터티의기본키변수의타입>
public interface MemberRepository extends JpaRepository<Member, Long> {
}
