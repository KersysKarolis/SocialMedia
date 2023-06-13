package lt.socialmedia.socialmedia.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Comment {
    private Long id;
    private String message;

}
