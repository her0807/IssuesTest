package com.skhu.skhuedIn.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);

    Member[] findAll();

    void delete(Member member);
}
