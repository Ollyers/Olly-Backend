package com.skygame.olly.member.controller.dto;

import com.skygame.olly.member.domain.Member;
import lombok.Builder;

@Builder
public record MemberResponse(long id, String nickname, int level) {
    public static MemberResponse from(Member member) {
        return MemberResponse.builder()
                .id(member.getId())
                .nickname(member.getNickname())
                .level(member.getLevel())
                .build();
    }
}
