package com.skhu.skhuedIn.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MemberServiceTest {
    MemberService memberService;
    Member member;
    Member member2;
    Member member3;

    @BeforeEach
    public void beforeEach() {

        memberService = new MemberServiceImpl();
        member = new Member(1L, "abc", "her0807@~", "www", Grade.student);
        member2 = new Member(2L, "adsadas", "her0807@~", "www", Grade.student);
        member3 = new Member(4L, "abasdsac", "her0807@~", "www", Grade.student);
    }

    @Test
    void save() {

        //given

        //when
        memberService.join(member);
        memberService.join(member2);
        memberService.join(member3);
        Member findMember = memberService.findMember(1L);
        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }

    @Test
    void delete() {
        memberService.delete(member2);
        Member findMember = memberService.findMember(2L);
        Assertions.assertThat(member2).isNotEqualTo(findMember);
    }

    @Test
    void findAll() {
        Member[] members = memberService.findAll();
        Member findMember = memberService.findMember(1L);

        for(Member m : members){
            System.out.println(m.getUser_id()+" "+m.getUser_email());
        }
        //then
        Assertions.assertThat(members).toString();

    }

}