package com.zk.zkssm.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zk.zkssm.entity.News;
import com.zk.zkssm.service.NewsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("admin/news")
public class NewsController {

    @Resource
    private NewsService newsService;

    @PostMapping("save")
//    @GetMapping("save")
    public Map insertNews(News news) {
        System.out.println("news => " + news);
        int num = newsService.insertNews(news);
        Map<String, Object> map = new HashMap<>();
        map.put("code",1);
        map.put("msg","success");
        return map;
    }

    @GetMapping("select")
    public Map select(String title,String category,
                      @RequestParam(defaultValue = "1") Integer page,
                      @RequestParam(defaultValue = "2") Integer limit) {
        // 开始分页 limit 自动加上，已经自动统计了总数
        PageHelper.startPage(page,limit);
        List<News> lists = newsService.getNewsAll(title, category);
        PageInfo<News> pageInfo = new PageInfo<>(lists);//封装分页数据
        Map<String, Object> map = new HashMap<>();
        map.put("code",1);
        map.put("msg","success");
        map.put("news",lists);
        map.put("count",pageInfo.getTotal());
        return map;
    }

}
