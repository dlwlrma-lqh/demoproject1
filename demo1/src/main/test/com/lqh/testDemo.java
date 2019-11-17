package com.lqh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class testDemo {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    public  void test1(){
        String sql="select * from users";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        for (Map<String,Object> map:maps) {
            for (String s:map.keySet()) {
                System.out.println(map.get(s));
            }
        }

    }
}
