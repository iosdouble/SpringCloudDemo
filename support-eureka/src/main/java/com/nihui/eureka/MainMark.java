package com.nihui.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname MainMark
 * @Description TODO
 * @Date 2020/6/23 10:27 PM
 * @Created by nihui
 */
@EnableEurekaServer
@SpringBootApplication
public class MainMark {

    public static void main(String[] args) {
        SpringApplication.run(MainMark.class,args);
    }
}
