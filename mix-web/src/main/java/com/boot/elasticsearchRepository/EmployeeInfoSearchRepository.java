package com.boot.elasticsearchRepository;

import com.boot.entity.EmployeeInfoSearchDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeInfoSearchRepository extends ElasticsearchRepository<EmployeeInfoSearchDTO,String> {


}
