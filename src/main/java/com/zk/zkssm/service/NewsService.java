package com.zk.zkssm.service;

import com.zk.zkssm.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsService {

    public int insertNews(News news);

    public List<News> getNews(String title, String category);

    public List<News> getNewsAll(String title, String category);
}
