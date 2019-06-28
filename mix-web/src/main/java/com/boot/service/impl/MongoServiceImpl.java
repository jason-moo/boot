package com.boot.service.impl;

import com.boot.entity.EmployeeInfoDTO;
import com.boot.mongoRepository.EmployeeInfoMongoRespository;
import com.boot.repository.EmployeeInfoRepository;
import com.boot.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class MongoServiceImpl implements MongoService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private EmployeeInfoRepository employeeInfoRepository;

    @Autowired
    private EmployeeInfoMongoRespository employeeInfoMongoRespository;

    @Override
    public void sync() {
        employeeInfoRepository.findAll().forEach(e ->{
            mongoTemplate.insert(e,"employeeInfo");
        });
    }

    @Override
    public EmployeeInfoDTO findById(String id) {
        return employeeInfoMongoRespository.findByIdNumber(id);
    }

}
