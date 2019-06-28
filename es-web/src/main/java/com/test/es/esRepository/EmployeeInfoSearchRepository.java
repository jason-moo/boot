package com.test.es.esRepository;

import com.test.es.entity.EmployeeInfoSearchDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInfoSearchRepository extends ElasticsearchRepository<EmployeeInfoSearchDTO,String> {


}
