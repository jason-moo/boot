package com.boot.service;

import com.boot.entity.EmployeeInfoDTO;

public interface MongoService {

    void sync();

    EmployeeInfoDTO findById(String id);

}
