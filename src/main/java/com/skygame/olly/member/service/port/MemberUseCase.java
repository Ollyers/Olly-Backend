package com.skygame.olly.member.service.port;

import com.skygame.olly.member.domain.Member;
import java.util.List;

public interface MemberUseCase {
    List<Member> findMembers();
}
