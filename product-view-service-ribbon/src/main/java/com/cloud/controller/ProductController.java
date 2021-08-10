package com.cloud.controller;

import com.cloud.entity.Product;
import com.cloud.service.ProductService;
import com.cloud.entity.Product;
import com.cloud.service.ProductService;
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
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products(Model m) {
        List<Product> ps = productService.listProducts();
        m.addAttribute("ps", ps);
        return "products";
    }
}
