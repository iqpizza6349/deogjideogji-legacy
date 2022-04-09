package com.tistory.workshop6349.deogjideogji.domain.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@AllArgsConstructor @NoArgsConstructor
@Builder
@Embeddable
public class OAuth implements Serializable {

    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    private String imageUrl;


}
