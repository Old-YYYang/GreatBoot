package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Dongsu
 * @date  2020/11/9 21:56
 * @desc  用户service
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * @author  Dongsu
     * @date  2020/11/10 22:05
     * @desc  单个用户信息
     **/
    public User singleUser(String userId) {

        if (null != userId) {
            return userDao.singleUser(userId);
        }
        return null;
    }

}
