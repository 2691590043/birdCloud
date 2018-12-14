package net.xinqushi.article.service;

import net.xinqushi.article.pojo.Comment;
import net.xinqushi.article.repository.CommentRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import utils.IdWorker;

import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentServiceTest {
    @Autowired
    private CommentRespository commentRespository;

    @Autowired
    private IdWorker idWorker;

    @Test
    public void add() {
        Comment comment = new Comment();
        comment.set_id( idWorker.nextId()+"" );
        comment.setArticleid("1");
        comment.setContent("fuck you");
        comment.setParentid("0");
        comment.setPublishdate(new Date());
        comment.setUserid("1");
        commentRespository.save(comment);
    }
}