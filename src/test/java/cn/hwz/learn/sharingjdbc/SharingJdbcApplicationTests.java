package cn.hwz.learn.sharingjdbc;

import cn.hwz.learn.sharingjdbc.domain.Sharingjdbc;
import cn.hwz.learn.sharingjdbc.mapper.SharingjdbcMapper;
import cn.hwz.learn.sharingjdbc.service.SharingjdbcService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("cn.hwz.learn.sharingjdbc.mapper")
class SharingJdbcApplicationTests {

    @Autowired
    private SharingjdbcMapper mapper;

    @Test
    void contextLoads() {

        for (int i =0;i<100;i++) {
            Sharingjdbc sharingjdbc = new Sharingjdbc();
            sharingjdbc.setContent("123213123");
            sharingjdbc.setId(Long.getLong(""+i));
            mapper.insertMe(sharingjdbc);
        }
    }

}
