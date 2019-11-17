package com.lqh.mapper;

import com.lqh.pojo.Users;
import com.lqh.pojo.bo.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserMapper {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Users selectByUphoneAndUpsd(String uphone, String upsd) {
        String sql="select * from users where uphone=? and upsd=?";
        Users u= jdbcTemplate.queryForObject(sql, new UserRowMapper(),uphone,upsd);
        return u;
    }

    public List<Users> selectByKeyword(String keyword) {
        String sql="select * from users where uphone like ?";
        List<Users> u= jdbcTemplate.query(sql, new UserRowMapper(),keyword);
        return u;
    }
}
