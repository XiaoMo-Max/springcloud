package com.example.cloud.controller;

import com.example.cloud.entity.Product;
import com.example.cloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 你的名字
 * @Date: 2021/08/09/16:31
 * @Description:
 */
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> ps = productService.listProducts();
        m.addAttribute("ps", ps);
        return ps;
    }
}
