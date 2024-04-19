package com.zk.zkssm.controller;

import com.zk.zkssm.dao.ProductDao;
import com.zk.zkssm.entity.Product;
import com.zk.zkssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Test {

    @Resource // 名称 即右边的 productService
//    @Autowired  按 类型 ProductService 如果是多个类型就不行
    private ProductService productService;

    @GetMapping("test")
    public Map<String, Object> test() {
        List<Product> product = productService.getProductList();


        System.out.println(product);

        Map<String, Object> map = new HashMap<>();
        map.put("product", product);
        map.put("product2",productService.getAllProduct());
        return map;
    }

}
