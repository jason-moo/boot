package com.boot.controller;

import com.boot.mongoRepository.EmployeeInfoMongoRespository;
import com.boot.entity.EmployeeInfo;
import com.boot.service.ElasticSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private EmployeeInfoMongoRespository employeeInfoMongoRespository;

    @Autowired
    private ElasticSearchService elasticSearchService;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @RequestMapping("test")
    @ResponseBody
    public Object test() {
        stringRedisTemplate.execute(new RedisCallback<Void>() {
            public Void doInRedis(RedisConnection redisConnection) throws DataAccessException {
                StringRedisConnection stringRedisConnection = (StringRedisConnection) redisConnection;
                System.out.println(stringRedisConnection.get("aaa"));
                return null;
            }
        });
        Query query = new Query();
        Criteria criteria = new Criteria();
        criteria.and("idNumber").is("330719197302090213");
        query.addCriteria(criteria);
        System.out.println(mongoTemplate.find(query,EmployeeInfo.class,"employeeInfo"));
        System.out.println(employeeInfoMongoRespository.findByIdNumber("330719197302090213"));
        return employeeInfoMongoRespository.findById("5c2485b78b8a003278693409");
    }

    @RequestMapping("index")
    @ResponseBody
    public Object index() {
        elasticSearchService.index();
//        GetQuery getQuery = new GetQuery();
//        getQuery.setId("330719197302090213");
//        EmployeeInfoSearchDTO employeeInfoSearchDTO = elasticsearchTemplate.queryForObject(getQuery,EmployeeInfoSearchDTO.class);
        return "fdefg4ewedwqdewdew";
    }

}
