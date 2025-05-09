package cn.hwz.learn.sharingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.hwz.learn.sharingjdbc.mapper")
public class SharingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharingJdbcApplication.class, args);
    }

}
