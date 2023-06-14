package lt.socialmedia.socialmedia.service;

import lt.socialmedia.socialmedia.entity.Comment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {
    List<Comment> commentList = new ArrayList<>();

    public List<Comment> getAllComments(){
        return commentList;
    }
    public Comment getCommentById(Long id){
        return commentList.stream().filter(comment -> comment.getId().equals(id)).findFirst().orElseThrow();
    }
    public List<Comment> postComment(Comment comment){
        this.commentList.add(comment);
        return commentList;
    }
    public List<Comment> deleteCommentById(Long id){
        this.commentList.remove(getCommentById(id));
        return commentList;
    }
    public List<Comment> editCommentById(Long id, Comment comment){
        Comment edibleComment = getCommentById(id);
        edibleComment.setMessage(comment.getMessage());
        int index = commentList.indexOf(getCommentById(id));
        this.commentList.set(index, comment);
        return this.commentList;
    }
}
