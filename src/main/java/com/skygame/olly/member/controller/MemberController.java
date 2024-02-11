package com.skygame.olly.member.controller;

import com.skygame.olly.member.controller.dto.MemberResponse;
import com.skygame.olly.member.service.port.MemberUseCase;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberUseCase memberUseCase;

    @GetMapping
    public ResponseEntity<List<MemberResponse>> memberList() {
        log.info("memberList api");
        List<MemberResponse> memberResponses = memberUseCase.findMembers().stream()
                .map(MemberResponse::from).toList();
        return ResponseEntity.ok(memberResponses);
    }
}
