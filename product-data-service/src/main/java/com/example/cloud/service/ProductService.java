package com.example.cloud.service;

import com.example.cloud.entity.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 你的名字
 * @Date: 2021/08/09/16:29
 * @Description:
 */
@Service
public class ProductService {
    @Value("${server.port}")
    String port;
    public List<Product> listProducts() {
        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1, "product a" + port, 50));
        ps.add(new Product(2, "product b" + port, 100));
        ps.add(new Product(3, "product c" + port, 150));
        return ps;
    }
}
