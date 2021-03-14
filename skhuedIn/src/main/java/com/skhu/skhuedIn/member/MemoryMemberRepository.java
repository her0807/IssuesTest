package com.skhu.skhuedIn.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getUser_id(),member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }

    @Override
    public Member[] findAll() {
        Member[] members = store.values().toArray(new Member[0]);
        return members;
    }

    @Override
    public void delete(Member member){   store.remove(member);}

}
