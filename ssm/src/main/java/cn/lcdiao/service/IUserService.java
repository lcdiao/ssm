package cn.lcdiao.service;

import cn.lcdiao.model.User;

import java.util.List;

public interface IUserService {
    List<User> getUser();
    User selectUser(Long id);
}
