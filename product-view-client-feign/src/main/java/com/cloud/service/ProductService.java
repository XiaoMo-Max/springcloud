package com.cloud.service;

import com.cloud.client.ProductClientFeign;
import com.cloud.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 你的名字
 * @Date: 2021/08/09/16:29
 * @Description:
 */
@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;
//    @Value("${server.port}")
//    String port;
    public List<Product> listProducts() {
//        List<Product> ps = new ArrayList<>();
//        ps.add(new Product(1, "product a" + port, 50));
//        ps.add(new Product(2, "product b" + port, 100));
//        ps.add(new Product(3, "product c" + port, 150));
//        return ps;
        return productClientFeign.listProducts();
    }
}
