package com.skhu.skhuedIn.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new
            MemoryMemberRepository();


    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
       return memberRepository.findById(memberId);
    }

    @Override
    public Member[] findAll() {
        return memberRepository.findAll();
    }

    @Override
    public void delete(Member member) {
        memberRepository.delete(member);

    }
}
