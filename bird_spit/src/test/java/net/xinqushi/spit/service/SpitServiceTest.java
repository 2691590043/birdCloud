package net.xinqushi.spit.service;

import net.xinqushi.spit.pojo.Spit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpitServiceTest {

    @Autowired
    private SpitService spitService;

    @Test
    public void findAll() {
        List<Spit> list = spitService.findAll();
        System.out.println(list);
    }

    @Test
    public void findById() {
        Spit spit = spitService.findById("1");
        System.out.println(spit);
    }

    @Test
    public void add() {
        Spit spit = new Spit();
        spit.set_id("1");
        spit.setComment(0);
        spit.setShare(0);
        spit.setNickname("XJ");
        spit.setContent("fuck you thank you");
        spit.setParentid("0");
        spit.setState("0");
        spit.setThumbup(0);
        spit.setUserid("1");
        spit.setVisits(0);
        spitService.add(spit);
    }

    @Test
    public void update() {
    }

    @Test
    public void deleteById() {
    }
}