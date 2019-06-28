package com.test.es.repository;

import com.test.es.entity.EmployeeInfo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInfoRepository extends PagingAndSortingRepository<EmployeeInfo, String> {

}
