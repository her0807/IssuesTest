package com.skhu.skhuedIn.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);

    Member[] findAll();

    void delete(Member member);
}
