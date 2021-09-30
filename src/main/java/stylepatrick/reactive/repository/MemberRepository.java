package stylepatrick.reactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;
import stylepatrick.reactive.entity.Member;

public interface MemberRepository extends ReactiveCrudRepository<Member, Long> {
    Mono<Member> findByName(String name);
}
