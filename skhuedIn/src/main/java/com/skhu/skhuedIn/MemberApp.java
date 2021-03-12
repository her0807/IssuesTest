package com.skhu.skhuedIn;

import com.skhu.skhuedIn.member.Grade;
import com.skhu.skhuedIn.member.Member;
import com.skhu.skhuedIn.member.MemberService;
import com.skhu.skhuedIn.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member
                (1L, "her0807@naver.com", "test123","aaa", Grade.student);
        memberService.join(member);


        System.out.println(member.getUser_id()+" "+member.getUser_email());


    }
}
