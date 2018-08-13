package com.sinosoft.analysis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@Configuration //指明该类是bean配置的信息源
@EnableAutoConfiguration //自动配置
@ComponentScan //自动发现扫描bean
@EnableTransactionManagement //注解事务*/
@SpringBootApplication
@MapperScan("com.sinosoft.analysis.domain.dao")
public class Application {
    public static void main(String [] args){
        SpringApplication.run(Application.class, args);
    }
}
