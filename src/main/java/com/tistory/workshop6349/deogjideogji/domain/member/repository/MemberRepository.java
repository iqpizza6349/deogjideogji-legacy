package com.tistory.workshop6349.deogjideogji.domain.member.repository;

import com.tistory.workshop6349.deogjideogji.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
