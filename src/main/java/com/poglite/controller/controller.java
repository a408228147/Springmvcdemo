package com.poglite.controller;

/**
 * Created by Administrator on 2017/7/11.
 */

import com.poglite.dao.UserRegister;
import com.poglite.idao.IUserRegister;
import com.poglite.model.UserModel;
import org.json.JSONObject;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.HttpCookie;
import java.util.List;

//controller的注解
@Controller
//地址
@RequestMapping("/demo")
public class controller{
    //方法的注解
    @Resource
     private IUserRegister UR;
    //指定的.do
    @RequestMapping("welcome.do")
public String welcome(UserModel UM , HttpServletRequest request, HttpServletResponse response,HttpSession session, HttpCookie cookie)
    {
        UR.userregister(UM);
        System.out.println(UM.getUsername());
        List<UserModel> list = UR.selectuser();
request.setAttribute("selectAll",list);
session.setAttribute("selectAll",list);

/*两个生命周期不一样，request的生命周期只在数据提交，提交以后即释放，
session则是浏览器关闭才释放
所以一般一些用户信息类的内容都会存在session里，
比如购物车内信息，或者用户登录的各种身份验证信息，
这样不会因为跳转页面而丢失这些信息*/
        return "welcome";
    }
        }

