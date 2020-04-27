package com.tan.test;

import com.tan.entity.User;
import com.tan.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> userList = userMapper.selectList( null );
        Assert.assertEquals( 6, userList.size() );
        userList.forEach( System.out::println );
    }

    @Test
    public void testAdd() {
        userMapper.insert(new User("lisi", 22, "27217723232@qq.com"));
    }

    @Test
    public void testDelete() {
       userMapper.deleteById(1);
    }

    @Test
    public void testUpdate() {
        userMapper.updateById(new User(6L, "wangwu", 25, "4235353254@qq.com"));
    }
}
