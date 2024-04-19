package com.zk.zkssm.dao;

import com.zk.zkssm.entity.News;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsDao {

    public int insertNews(News news);

    public List<News> getNews(@Param("title") String title, @Param("category") String category);

    public List<News> getNewsAll(@Param("title") String title, @Param("category") String category);
}
