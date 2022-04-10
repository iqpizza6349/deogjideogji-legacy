package com.tistory.workshop6349.deogjideogji.domain.member.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tistory.workshop6349.deogjideogji.domain.member.entity.Member;
import com.tistory.workshop6349.deogjideogji.domain.member.entity.OAuth;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor @NoArgsConstructor
public class MemberDto {

    private long id;

    private String email;

    private String name;

    @JsonProperty("image_url")
    private String imageUrl;

    public MemberDto(Member member) {
        this(member.getId(), member.getOAuth());
    }
    
    private MemberDto(long id, OAuth oAuth) {
        this.id = id;
        this.email = oAuth.getEmail();
        this.name = oAuth.getUsername();
        this.imageUrl = oAuth.getImageUrl();
    }

}
