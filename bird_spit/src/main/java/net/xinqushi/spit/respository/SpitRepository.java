package net.xinqushi.spit.respository;

import net.xinqushi.spit.pojo.Spit;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * springData mongodb
 */
public interface SpitRepository extends MongoRepository<Spit, String> {
}