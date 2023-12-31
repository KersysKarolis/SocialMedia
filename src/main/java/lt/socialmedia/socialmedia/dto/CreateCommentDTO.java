package lt.socialmedia.socialmedia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CreateCommentDTO {
    private Long authorId;
    private String message;
}
