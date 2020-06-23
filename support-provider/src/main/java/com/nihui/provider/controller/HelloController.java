package com.nihui.provider.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2020/6/23 10:41 PM
 * @Created by nihui
 */
@RestController
public class HelloController {


    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        List<String> services = client.getServices();
        for (String service:services) {
            System.out.println(service);
        }

        List<ServiceInstance> instances = client.getInstances("hello-service");
        for (ServiceInstance instance:instances) {
            System.out.println(instance.getServiceId());
        }
        return "Hello World!";
    }


}
