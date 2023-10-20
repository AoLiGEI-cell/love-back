package com.quanshu.loveback;

import com.quanshu.loveback.mapper.UserMapper;
import com.quanshu.loveback.pojo.Result;
import com.quanshu.loveback.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LoveBackApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testDeleteUser() {
        int del = userMapper.deleteUser(3);
        Result result = Result.success(del);
        System.out.println(result);
//        return result;
    }

    @Test
    public void testListUser() {
        Result result = new Result();
        List<User> userList = userMapper.list("shark","115");
        if(userList.isEmpty()){
            result = Result.error("用户名或密码错误！");
        }else {
            result = Result.success();
        }
        System.out.println(result);
    }

    @Test
    public void testAddUser(){
        User user = new User();
        user.setPassword("14789632");
        user.setUsertype("test");
        user.setProfilephoto("none");
        int add = userMapper.addUser(user);
        Result result = Result.success(add);
        System.out.println(result);
    }

    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setUsertype("change");
        user.setProfilephoto("changeprofilephoto");
        user.setUserid(4);
        int update = userMapper.update(user);
        Result result = Result.success(update);
        System.out.println(result);
    }
}
