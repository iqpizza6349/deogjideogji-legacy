package com.tistory.workshop6349.deogjideogji.global.domain;

import com.tistory.workshop6349.deogjideogji.domain.member.entity.Member;
import lombok.Getter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Getter
@Embeddable
public class Author implements Serializable {

    @OneToOne
    @JoinColumn(name = "author_id")
    private Member member;

}
