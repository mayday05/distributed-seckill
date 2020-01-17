package cn.com.bluemoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

/**
 * seckill service服务启动类</p>
 */
@Configuration
@RestController
@SpringBootApplication
@EnableTransactionManagement //启用事务
public class ServiceSeckillApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServiceSeckillApplication.class, args);
    }

}
