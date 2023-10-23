package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

//구현체.
// 인터페이스 MemberRepository 구현
@Component
public class MemoryMemberRepository implements MemberRepository{
    private static Map<Long, Member> store = new HashMap<>(); //db가 확정이 안되었기에 임시로 사용, 실무에서는 동시성이슈로 Concurrent HashMap을 사용함
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);

    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }



}
