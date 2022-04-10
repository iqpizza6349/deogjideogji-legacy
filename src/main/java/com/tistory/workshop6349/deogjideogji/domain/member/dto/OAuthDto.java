package com.tistory.workshop6349.deogjideogji.domain.member.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor @NoArgsConstructor
public class OAuthDto {

    @NotNull
    private String email;

    @NotNull
    private String name;

    @JsonProperty(value = "image_url")
    @NotNull
    private String imageUrl;

}
