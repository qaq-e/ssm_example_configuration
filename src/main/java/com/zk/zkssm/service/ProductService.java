package com.zk.zkssm.service;

import com.zk.zkssm.entity.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    public List<Product> getProductList();

    public List<Product> getAllProduct();
}
