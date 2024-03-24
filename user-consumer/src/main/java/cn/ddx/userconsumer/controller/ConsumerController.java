package cn.ddx.userconsumer.controller;

import cn.ddx.mydubbo.api.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel.hou
 * @date 3/15/24 10:42 PM
 * @Desc
 */
@RestController
public class ConsumerController {


    @Reference
    private UserService userService;

    @RequestMapping("/consumer/hello")
    String sayHello(String name) {

        return userService.sayHello(name);
    }
}
