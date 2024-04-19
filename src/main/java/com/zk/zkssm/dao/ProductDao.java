package com.zk.zkssm.dao;

import com.zk.zkssm.entity.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao {

    @Select("Select  * from product")
    public List<Product> getProductList();



    public List<Product> getAllProduct();
    // 把sql 代码放到 xml 文件中
    // 方法名 与 xml 中的 id 值一致
}
