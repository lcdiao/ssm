package cn.lcdiao.service.impl;

import cn.lcdiao.dao.IUserDao;
import cn.lcdiao.model.User;
import cn.lcdiao.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    IUserDao userDao;

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }

    @Override
    public User selectUser(Long id) {
        return userDao.selectUser(id);
    }
}
