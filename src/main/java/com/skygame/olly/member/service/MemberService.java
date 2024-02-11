package com.skygame.olly.member.service;

import com.skygame.olly.member.domain.Member;
import com.skygame.olly.member.repository.MemberSpringDataRepository;
import com.skygame.olly.member.service.port.MemberUseCase;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements MemberUseCase {

    private final MemberSpringDataRepository memberSpringDataRepository;

    @Override
    public List<Member> findMembers() {
        return memberSpringDataRepository.findAll();
    }
}
