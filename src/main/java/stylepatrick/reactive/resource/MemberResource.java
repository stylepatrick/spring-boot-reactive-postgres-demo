package stylepatrick.reactive.resource;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import stylepatrick.reactive.entity.Member;
import stylepatrick.reactive.repository.MemberRepository;

import java.time.Duration;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/api")
public class MemberResource {

    private final MemberRepository memberRepository;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Member> getAll() {
        return memberRepository.findAll().delayElements(Duration.ofSeconds(1));
    }

    @GetMapping(value = "/{name}")
    public Mono<Member> getByName(
            @PathVariable String name
    ) {
        return memberRepository.findByName(name);
    }

    @GetMapping(value = "/create/{name}")
    public Mono<Member> createMember(
            @PathVariable String name
    ) {
        return memberRepository.save(new Member(name));
    }

    @GetMapping(value = "/delete/{id}")
    public Mono<Void> deleteMember(
            @PathVariable Long id
    ) {
        return memberRepository.deleteById(id);
    }
}
