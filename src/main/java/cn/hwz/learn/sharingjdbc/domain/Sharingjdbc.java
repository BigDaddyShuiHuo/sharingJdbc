package cn.hwz.learn.sharingjdbc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName sharingJdbc
 */
@TableName(value ="sharingjdbc")
@Data
public class Sharingjdbc {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String content;
}