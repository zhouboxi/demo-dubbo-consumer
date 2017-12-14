package com.jxlg.app.controller;


import com.jxlg.app.api.IUserService;
import com.jxlg.app.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @author zhouboxi
 * @create 2017-12-08 15:31
 **/
@Controller
@RequestMapping(value = "/user/")
public class UserController {

    @Resource
    private IUserService iUserService;

    @RequestMapping(value = "login" ,method = RequestMethod.POST)
    public String login(String name, String password, ModelMap model){
        if(StringUtils.isBlank(name)||StringUtils.isBlank(password)){
            model.addAttribute("msg","不能为空");
        }
        User user = iUserService.findByNameAndPassword(name, password);
        if(user!=null){
            user.setPassword(StringUtils.EMPTY);
            model.addAttribute("user",user);
            return "index";

        }
        model.addAttribute("msg","用户名密码不正确!");
        return "logins";
    }

    @RequestMapping(value = "index")
    public String login(){

        return "logins";
    }
}

