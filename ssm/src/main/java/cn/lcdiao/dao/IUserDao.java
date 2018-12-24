package cn.lcdiao.dao;

import cn.lcdiao.model.User;

import java.util.List;

public interface IUserDao {
    List<User> getUser();
    User selectUser(Long id);
}
