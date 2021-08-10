package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 你的名字
 * @Date: 2021/08/09/18:34
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProductViewServiceRibbon {
    public static void main(String[] args) {
//        int port = 0;
//        int defaultPort = 8001;
//
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
        new SpringApplication(ProductViewServiceRibbon.class).run(args);
    }
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
