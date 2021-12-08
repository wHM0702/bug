package com.example.bug.dao;

import com.example.bug.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao {

    List<User> getAllU();

    boolean insertBuy(@Param("bid") int bid,@Param("pid") int pid);

    boolean updProduct(@Param("pid") int pid);

    int stock(@Param("pid") int pid);

    List<Integer> queryID();
    List<Integer> queryStock();
}
