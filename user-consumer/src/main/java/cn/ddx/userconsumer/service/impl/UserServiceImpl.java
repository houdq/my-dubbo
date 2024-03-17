package cn.ddx.userconsumer.service.impl;

import cn.ddx.userconsumer.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author daniel.hou
 * @date 3/17/24 3:01 PM
 * @Desc
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return name + "  hello!";
    }
}
