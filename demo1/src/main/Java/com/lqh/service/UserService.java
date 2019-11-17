package com.lqh.service;

import com.lqh.pojo.Users;

import java.util.List;

public interface UserService {
    Users login(String uphone, String upsd);

    List<Users> getOne(String keyword);
}
