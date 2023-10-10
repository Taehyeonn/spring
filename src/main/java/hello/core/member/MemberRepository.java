package hello.core.member;

public interface MemberRepository {

    //저장, 검색 두가지만 만듦
    void save(Member member);
    Member findById(Long memberId);
}
