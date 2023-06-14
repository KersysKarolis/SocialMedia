package lt.socialmedia.socialmedia.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;



@Getter
@Setter
public class Account {
    private static Long index = 0L;
    private Long id;
    private String name;
    private String lastname;
    private Integer age;
     private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Account (String name, String lastname, Integer age){
        this.id = ++index;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

}
