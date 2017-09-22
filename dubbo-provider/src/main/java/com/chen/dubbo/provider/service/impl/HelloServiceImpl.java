package com.chen.dubbo.provider.service.impl;

import com.chen.dubbo.api.service.HelloService;
import org.springframework.stereotype.Service;
/**
 * <p>Tiltle: com.chen.dubbo.provider.service.impl </p>
 * <p>Description: TODO(这里来描述信息) </p>
 *
 * @Author 陈德元
 * @data: 2017-09-22
 * @version: 1.0
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
