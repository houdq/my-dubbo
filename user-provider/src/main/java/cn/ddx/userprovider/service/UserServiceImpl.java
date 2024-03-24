package cn.ddx.userprovider.service;

import cn.ddx.mydubbo.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author daniel.hou
 * @date 3/15/24 10:32 PM
 * @Desc
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
