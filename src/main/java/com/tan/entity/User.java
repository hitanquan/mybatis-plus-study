package com.tan.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    @TableId("id")
    private Long userId;
    private String name;
    private Integer age;
    private String email;
    @TableField(exist = false)
    private String remark;

    public User(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public User(Long userId, String name, Integer age, String email) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
