package stylepatrick.reactive.client;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import stylepatrick.reactive.entity.Member;

import java.io.Flushable;

@Component
@AllArgsConstructor
public class Client {

    private final WebClient webClient;

    @Scheduled(fixedDelay = 20000)
    public void getMember() {
        webClient.get()
                .uri("/")
                .retrieve()
                .bodyToFlux(Member.class)
                .subscribe(member -> System.out.println(member.getId() + " " + member.getName()));
    }

}
