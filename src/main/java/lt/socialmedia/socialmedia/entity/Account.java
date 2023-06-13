package lt.socialmedia.socialmedia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Account {
    private Long id;
    private String name;
    private String lastname;
    private Integer age;
}
