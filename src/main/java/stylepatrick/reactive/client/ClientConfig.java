package stylepatrick.reactive.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@EnableScheduling
public class ClientConfig {

    @Bean
    WebClient webClient() {
        return WebClient.create("http://localhost:8080/api").mutate().build();
    }
}
