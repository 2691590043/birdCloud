package net.xinqushi.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.IdWorker;

@SpringBootApplication
@RestController
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class);
    }

    @GetMapping(value = "/testId")
    public long idWorker(){
        return new IdWorker(1,1).nextId();
    }
    @Bean
    public IdWorker getIdWorker(){
        return new IdWorker(1,1);
    }
}
