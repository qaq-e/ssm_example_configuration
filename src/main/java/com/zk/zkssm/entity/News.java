package com.zk.zkssm.entity;

import lombok.Data;

@Data
public class News {
    private Integer id;
    private String title;
    private String category;
    private String content;
    private Long addtime;
    private String pic;
    private Sorts sorts;

    public News(Integer id, String title, String category, String content, Long addtime) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.content = content;
        this.addtime = addtime;
    }
}
