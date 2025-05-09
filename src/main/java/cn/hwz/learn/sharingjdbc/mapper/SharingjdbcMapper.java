package cn.hwz.learn.sharingjdbc.mapper;

import cn.hwz.learn.sharingjdbc.domain.Sharingjdbc;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 59755
* @description 针对表【sharingJdbc】的数据库操作Mapper
* @createDate 2025-04-28 00:57:17
* @Entity cn.hwz.learn.sharingjdbc.domain.Sharingjdbc
*/

public interface SharingjdbcMapper extends BaseMapper<Sharingjdbc> {
    @Insert(value = "       INSERT INTO sharingjdbc\n" +
            "            (id, content)\n" +
            "        VALUES\n" +
            "            (#{id}, #{content});")
    int insertMe(Sharingjdbc sharingjdbc);
}




