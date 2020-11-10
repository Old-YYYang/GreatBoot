package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author  Dongsu
 * @date  2020/11/9 23:21
 * @desc  用户Dao
 **/
@Mapper
public interface UserDao {

    /**
     * @author  Dongsu
     * @date  2020/11/10 22:05
     * @desc  单个用户信息
     **/
    User singleUser(@Param("userId") String userId);
}
