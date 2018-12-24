package cn.lcdiao.controller;

import cn.lcdiao.model.User;
import cn.lcdiao.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUser() {
        return userService.getUser();
    }
}
