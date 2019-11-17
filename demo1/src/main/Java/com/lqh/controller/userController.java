package com.lqh.controller;

import com.lqh.common.ResponseBodyCode;
import com.lqh.pojo.Users;
import com.lqh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/portal/user/")
@ResponseBody
public class userController {

    @Autowired
    UserService userService;
    @RequestMapping("login.do")
    public Users login(String uphone, String upsd, HttpSession httpSession){

       Users u=userService.login(uphone,upsd);

       if(u!=null)
       {
           httpSession.setAttribute("user",u);
       }

       return u;
    }

    @RequestMapping("getOne.do")
    public ResponseBodyCode getOne(String keyword){

       List<Users> li=userService.getOne(keyword);
        return ResponseBodyCode.successData(li);
    }
}
