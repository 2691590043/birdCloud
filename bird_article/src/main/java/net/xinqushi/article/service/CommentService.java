package net.xinqushi.article.service;

import net.xinqushi.article.pojo.Comment;
import net.xinqushi.article.repository.CommentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.IdWorker;

import java.util.List;

@Service
public class CommentService{

    @Autowired
    private CommentRespository commentRespository;
    @Autowired
    private IdWorker idWorker;
    public void add(Comment comment){
        comment.set_id( idWorker.nextId()+"" );
        commentRespository.save(comment);
    }
    public List<Comment> findByArticleid(String articleid){
        return commentRespository.findByArticleid(articleid);

    }

}
