package com.soft.dao;

import com.soft.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2020/2/13.
 */
public interface UserDao {
    @Select(value = "select * from user")
    public List<User> findAll();
}
