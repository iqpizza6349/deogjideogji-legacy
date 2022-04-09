package com.tistory.workshop6349.deogjideogji.domain.member.service;

import com.tistory.workshop6349.deogjideogji.domain.member.dto.MemberDto;
import com.tistory.workshop6349.deogjideogji.domain.member.dto.OAuthDto;
import com.tistory.workshop6349.deogjideogji.domain.member.entity.Member;
import com.tistory.workshop6349.deogjideogji.domain.member.entity.OAuth;
import com.tistory.workshop6349.deogjideogji.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OAuthLoginServiceImpl implements OAuthLoginService {

    private final MemberRepository memberRepository;

    @Override
    public MemberDto login(OAuthDto oAuthDto) {
        String email = oAuthDto.getEmail();
        
        if (memberRepository.existsByOAuthEmail(email)) {
            throw new Member.AlreadyExistedEmail();
        }

        Member member = Member.builder()
                .oAuth(createOAuth(oAuthDto))
                .build();

        return new MemberDto(memberRepository.save(member));
    }

    private OAuth createOAuth(OAuthDto oAuthDto) {
        return OAuth.builder()
                .email(oAuthDto.getEmail())
                .username(oAuthDto.getName())
                .imageUrl(oAuthDto.getImageUrl())
                .build();
    }


}
