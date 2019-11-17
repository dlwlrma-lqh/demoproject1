package com.lqh.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class SqlSessionUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        InputStream resourceAsStream= null;
        try {
            resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
        public static SqlSessionFactory getSqlSessionFactory(){
            return sqlSessionFactory;
    }
}
