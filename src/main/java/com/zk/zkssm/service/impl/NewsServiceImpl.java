package com.zk.zkssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.zk.zkssm.dao.NewsDao;
import com.zk.zkssm.entity.News;
import com.zk.zkssm.service.NewsService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Repository("newsService")
public class NewsServiceImpl implements NewsService {

    @Resource
    private NewsDao newsDao;

    @Override
    public int insertNews(News news) {
        news.setAddtime(System.currentTimeMillis());
        return newsDao.insertNews(news);
    }

    @Override
    public List<News> getNews(String title, String category){
        return newsDao.getNews(title, category);
    }

    @Override
    public List<News> getNewsAll(String title, String category) {
        return newsDao.getNewsAll(title, category);
    }
}
