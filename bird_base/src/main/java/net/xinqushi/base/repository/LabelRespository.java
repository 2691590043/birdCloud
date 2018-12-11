package net.xinqushi.base.repository;

import net.xinqushi.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * label dao
 */
public interface LabelRespository extends JpaRepository<Label,String> , JpaSpecificationExecutor<Label> {
    //dao
}
