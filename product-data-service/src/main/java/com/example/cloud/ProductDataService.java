package com.example.cloud;

import brave.sampler.Sampler;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.NumberUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @Author: 你的名字
 * @Date: 2021/08/09/18:34
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductDataService {
    public static void main(String[] args) {
//        int port = 0;
//        int defaultPort = 8001;
//        Future<Integer> future = ThreadUtil.execAsync(() ->{
//            int p = 0;
//            System.out.println("请于5秒钟内输入端口号, 推荐  8001 、 8002  或者  8003，超过5秒将默认使用 " + defaultPort);
//            Scanner scanner = new Scanner(System.in);
//            while (true) {
//                String s = scanner.nextLine();
//                if (NumberUtil.isInteger(s)) {
//                    p = Convert.toInt(s);
//                    scanner.close();
//                    break;
//                } else {
//                    System.err.println("请输入正确的格式");
//                }
//            }
//            return p;
//        });
//        try {
//            port = future.get(5, TimeUnit.SECONDS);
//        } catch ( InterruptedException | TimeoutException | ExecutionException e) {
//            port = defaultPort;
//        }
//        new SpringApplicationBuilder(ProductDataService .class).properties("server.port =" + port).run(args);
        new SpringApplication(ProductDataService.class).run(args);
    }

    /**
     * Sampler抽样策略
     * ALWAYS_SAMPLER
     * @return
     */
    @Bean
    public Sampler sampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}
