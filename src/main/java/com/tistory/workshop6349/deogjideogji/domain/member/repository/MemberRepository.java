package com.tistory.workshop6349.deogjideogji.domain.member.repository;

import com.tistory.workshop6349.deogjideogji.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.validation.constraints.NotNull;

public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query("select (count(m) > 0) from Member m where m.oAuth.email = ?1")
    boolean existsByOAuthEmail(@NotNull String OAuth_email);

}
