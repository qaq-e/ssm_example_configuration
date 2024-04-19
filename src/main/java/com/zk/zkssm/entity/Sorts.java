package com.zk.zkssm.entity;

import lombok.Data;

@Data
public class Sorts {
    private Integer id;
    private String sortName;
    private String parentId;
    private String sortPath;
}
