package com.cloud.client;

import com.cloud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: 你的名字
 * @Date: 2021/08/10/9:42
 * @Description:
 */
@Component
public class ProductClientRibbon {
    @Autowired
    RestTemplate restTemplate;

    public List<Product> getProducts(){
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }
}
