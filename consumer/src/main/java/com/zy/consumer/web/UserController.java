package com.zy.consumer.web;

import com.zy.api.entity.User;
import com.zy.api.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
/**
 * @author zhangy
 * @version Revision 2.0.0
 * @email: zhangy2222z@sina.cn
 * @create 2019-05-05 14:25
 **/
@RestController
public class UserController {

//    @Autowired
//    private ConsumerService consumerService;

    @Reference
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser(){
        return userService.getUser();
    }

}
