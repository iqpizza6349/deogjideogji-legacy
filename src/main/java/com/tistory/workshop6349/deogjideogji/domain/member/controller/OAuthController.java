package com.tistory.workshop6349.deogjideogji.domain.member.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RequestMapping("/oauth")
@RestController
public class OAuthController {

    @PostMapping("/google/rollback")
    public void get() {
        log.info("요청 들어옴");
    }


}
