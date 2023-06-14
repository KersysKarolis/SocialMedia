package lt.socialmedia.socialmedia.controller;

import lt.socialmedia.socialmedia.entity.Comment;
import lt.socialmedia.socialmedia.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping
    public List<Comment> getComments(){
        return this.commentService.getAllComments();
    }
    @PostMapping
    public Comment createComment(@RequestBody Comment comment){
        this.commentService.postComment(comment);
        return comment;
    }
    @PatchMapping("/{id}")
    public Comment editCommentById(@PathVariable Long id, @RequestBody Comment comment){
        this.commentService.editCommentById(id, comment);
        return comment;

    }
}
