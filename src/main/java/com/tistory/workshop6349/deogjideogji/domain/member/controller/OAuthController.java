package com.tistory.workshop6349.deogjideogji.domain.member.controller;

import com.tistory.workshop6349.deogjideogji.domain.member.dto.MemberDto;
import com.tistory.workshop6349.deogjideogji.domain.member.dto.OAuthDto;
import com.tistory.workshop6349.deogjideogji.domain.member.service.OAuthLoginServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/oauth")
@RequiredArgsConstructor
@RestController
public class OAuthController {

    private final OAuthLoginServiceImpl oAuthLoginService;

    @PostMapping("/google/rollback")
    @ResponseStatus(value = HttpStatus.CREATED)
    public MemberDto rollback(@RequestBody OAuthDto oAuthDto) {
        return oAuthLoginService.login(oAuthDto);
    }

}
