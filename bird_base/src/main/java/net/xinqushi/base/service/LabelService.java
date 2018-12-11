package net.xinqushi.base.service;/**
 * @Auther: XJ
 * @Date: 2018/12/11 22:31
 * @Description:
 */

import net.xinqushi.base.pojo.Label;
import net.xinqushi.base.repository.LabelRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.IdWorker;

import java.util.List;

/**
 * @Auther: XJ
 * @Date: 2018/12/11 22:31
 * @Description: Label Service
 */
@Service
public class LabelService {

    @Autowired
    private LabelRespository labelRespository;
    @Autowired
    private IdWorker idWorker;

    /**
     * 查询全部标签
     * @return
     */
    public List<Label> findAll(){
        return labelRespository.findAll();
    }
    /**
     * 根据ID查询标签
     * @return
     */
    public Label findById(String id){
        return labelRespository.findById(id).get();
    }
    /**
     * 增加标签
     * @param label
     */
    public void add(Label label){
        label.setId( idWorker.nextId()+"" );//设置ID
        labelRespository.save(label);
    }
    /**
     * 修改标签
     * @param label
     */
    public void update(Label label){
        labelRespository.save(label);
    }
    /**
     * 删除标签
     * @param id
     */
    public void deleteById(String id){
        labelRespository.deleteById(id);
    }

}
