package com.boot.service;

import com.boot.entity.EmployeeInfoSearchDTO;

import java.util.List;

public interface ElasticSearchService {

    void index();

    List<EmployeeInfoSearchDTO> search();

}
