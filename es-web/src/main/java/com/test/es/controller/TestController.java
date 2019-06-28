package com.test.es.controller;

import com.test.es.service.ElasticSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/es")
public class TestController {


    @Autowired
    private ElasticSearchService elasticSearchService;

    @RequestMapping("/index")
    public void index(){
        Date now = new Date();
        elasticSearchService.index();
        Date end = new Date();
        System.out.println(end.getTime() - now.getTime());
    }

    @RequestMapping("/bulk")
    public void bulk(){
        Date now = new Date();
        elasticSearchService.builk();
        Date end = new Date();
        System.out.println(end.getTime() - now.getTime());
    }

}
