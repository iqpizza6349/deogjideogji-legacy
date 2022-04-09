package com.tistory.workshop6349.deogjideogji.domain.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.*;

@Getter
@AllArgsConstructor @NoArgsConstructor
@Builder
@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private OAuth oAuth;

    @ResponseStatus(value = HttpStatus.CONFLICT, reason = "이미 존재하는 이메일입니다.")
    public static class AlreadyExistedEmail extends RuntimeException {
    }

}
