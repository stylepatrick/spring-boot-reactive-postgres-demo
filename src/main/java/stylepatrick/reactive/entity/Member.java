package stylepatrick.reactive.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter(AccessLevel.PROTECTED)
public class Member {

    @Id
    private Long id;

    private String name;

    public Member(String name) {
        this.name = name;
    }
}
