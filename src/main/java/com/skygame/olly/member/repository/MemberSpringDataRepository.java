package com.skygame.olly.member.repository;

import com.skygame.olly.member.domain.Member;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberSpringDataRepository extends JpaRepository<Member, Long> {

}
