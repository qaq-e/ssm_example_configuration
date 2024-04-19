package com.zk.zkssm.service.impl;

import com.zk.zkssm.dao.ProductDao;
import com.zk.zkssm.entity.Product;
import com.zk.zkssm.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductDao productDao;

    @Override
    public List<Product> getProductList() {

        return productDao.getProductList();
    }

    @Override
    public List<Product> getAllProduct() {
        return productDao.getAllProduct();
    }
}
