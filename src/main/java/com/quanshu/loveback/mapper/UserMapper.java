package com.quanshu.loveback.mapper;

import com.quanshu.loveback.pojo.Result;
import com.quanshu.loveback.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user where usertype = #{usertype} and password = #{password}")
    public List<User> list(@Param("usertype") String usertype, @Param("password") String password);

    @Delete("delete from user where userid = #{id}")
    public int deleteUser(Integer id);

    @Insert("insert into user(password, usertype, profilephoto)" +
            "values (#{password}, #{usertype}, #{profilephoto})")
    public int addUser(User user);

    @Update("update user set usertype = #{usertype}, profilephoto = #{profilephoto} where userid = #{userid}")
    public int update(User user);
}
