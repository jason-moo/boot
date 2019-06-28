package com.boot.repository;

import com.boot.entity.EmployeeInfo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInfoRepository extends PagingAndSortingRepository<EmployeeInfo, String> {


}
