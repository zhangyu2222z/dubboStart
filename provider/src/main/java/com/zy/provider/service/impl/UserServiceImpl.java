package com.zy.provider.service.impl;


//import com.alibaba.dubbo.config.annotation.Service;
//import com.zy.api.entity.User;
//import com.zy.api.service.UserService;

import org.springframework.stereotype.Service;
import com.zy.api.entity.User;
import com.zy.api.service.UserService;

/**
 * @author zhangy
 * @version Revision 2.0.0
 * @email: zhangy2222z@sina.cn
 * @create 2019-04-24 16:59
 **/
@Service
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        User user = new User();
        user.setName("zy");
        user.setPassword("123456");
        return user;
    }
}
