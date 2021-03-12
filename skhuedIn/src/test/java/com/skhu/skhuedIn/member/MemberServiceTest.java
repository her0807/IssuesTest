package com.skhu.skhuedIn.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    void save() {

        //given
        Member member = new Member(1L, "abc", "her0807@~", "www", Grade.student);
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }

}