package com.tistory.workshop6349.deogjideogji.domain.member.service;

import com.tistory.workshop6349.deogjideogji.domain.member.dto.MemberDto;
import com.tistory.workshop6349.deogjideogji.domain.member.dto.OAuthDto;

public interface OAuthLoginService {

    /**
     * OAuthDto 의 값들을 RequestBody 로 받아
     * 이미지 저장, 이메일 등 OAuth 정보를 저장한다.
     * @param oAuthDto OAUTH 정보를 받는다.
     */
     MemberDto login(OAuthDto oAuthDto);

}
