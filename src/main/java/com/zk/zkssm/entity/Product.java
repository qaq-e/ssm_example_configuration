package com.zk.zkssm.entity;

import lombok.Data;

@Data
public class Product {

    // 实体类中，不要使用 基本数据类型
//    原因： 数据库查询 信息会自动 映射为实体对象
    private Integer id;

    private String productName;

    private String category;
}
