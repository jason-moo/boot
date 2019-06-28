package com.boot.mongoRepository;

import com.boot.entity.EmployeeInfoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInfoMongoRespository extends MongoRepository<EmployeeInfoDTO,String> {

    EmployeeInfoDTO findByIdNumber(String idNumber);

}
