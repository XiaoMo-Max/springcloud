package com.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: 你的名字
 * @Date: 2021/08/10/12:47
 * @Description:
 */
@EnableConfigServer
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ConfigServer {
    public static void main(String[] args) {
        int port = 8005;
        new SpringApplicationBuilder(ConfigServer.class).properties("server port = " + port).run(args);
    }
}
