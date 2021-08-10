package com.cloud.client;

import com.cloud.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: 你的名字
 * @Date: 2021/08/10/9:42
 * @Description:
 */
@Component
@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {
    /**
     * ribbon以及下面的feign方式，feign方式是对ribbon的封装
     * 注解方式开发，十分方便
     * ribbon是一个component
     * feign是一个接口
     */
//    @Autowired
//    RestTemplate restTemplate;
//
//    public List<Product> getProducts(){
//        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
//    }
    /**
     * feign
     */
    @GetMapping("/products")
    public List<Product> listProducts();
}
