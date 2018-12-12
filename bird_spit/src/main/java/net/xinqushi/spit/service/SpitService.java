package net.xinqushi.spit.service;

import net.xinqushi.spit.pojo.Spit;
import net.xinqushi.spit.respository.SpitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.IdWorker;

import java.util.List;

@Service
public class SpitService {
    @Autowired
    private SpitRepository spitRepository;
    @Autowired
    private IdWorker idWorker;

    /**
     * 查询全部记录
     * @return
     */
    public List<Spit> findAll(){
        return spitRepository.findAll();
    }
    /**
     * 根据主键查询实体
     * @param id
     * @return
     */
    public Spit findById(String id){
        Spit spit = spitRepository.findById(id).get();
        return spit;
    }
    /**
     * 增加
     * @param spit
     */
    public void add(Spit spit) {
        spit.set_id(idWorker.nextId()+""); //主键值
        spitRepository.save(spit);
    }/**
     * 修改
     * @param spit
     */
    public void update(Spit spit) {
        spitRepository.save(spit);
    }
    /**
     * 删除
     * @param id
     */
    public void deleteById(String id) {
        spitRepository.deleteById(id);
    }

}
