package hello.core.member;

public class MemberServiceImpl implements MemberService{

//    private final MemberRepository memberRepository = new MemoryMemberRepository();
// 위의 코드처럼 구현체를 메모리멤버리포지토리로 고정하는것이 아니라
// 생성자를 통해 멤버 리포지토리의 구현체를 정한다. (생성자 주입)
    private final MemberRepository memberRepository; //이 클래스에서 멤버 리포지토리는 오직 인터페이스에만 의존

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //임시) 테스트용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
