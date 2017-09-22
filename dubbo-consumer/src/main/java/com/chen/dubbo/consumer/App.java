package com.chen.dubbo.consumer;


import com.chen.dubbo.api.service.HelloService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Tiltle: com.chen.dubbo.consumer </p>
 * <p>Description: TODO(这里来描述信息) </p>
 *
 * @Author 陈德元
 * @data: 2017-09-22
 * @version: 1.0
 */
@SpringBootApplication
public class App {

    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-dubbo.xml"});
        HelloService helloService = (HelloService) ctx.getBean("helloService");
        System.out.println(helloService.sayHello("lxy"));
    }
}
