package com.lqh.service.impl;

import com.lqh.mapper.UserMapper;
import com.lqh.pojo.Users;
import com.lqh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Users login(String uphone, String upsd) {
        Users u=null;
        if(uphone!=null&&upsd!=null) {
            u = userMapper.selectByUphoneAndUpsd(uphone, upsd);
        }
        return u;
    }

    @Override
    public List<Users> getOne(String keyword) {
        String keys="%"+keyword+"%";
        List<Users> li=null;
        if(keyword!=null) {
            li = userMapper.selectByKeyword(keys);
        }
        return li;
    }
}
