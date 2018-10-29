package com.zhang.dao;

import com.zhang.model.UserDomain;

import java.util.List;

public interface UserDao {
    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}