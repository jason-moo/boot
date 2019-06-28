package com.boot.service.impl;

import com.boot.elasticsearchRepository.EmployeeInfoSearchRepository;
import com.boot.entity.EmployeeInfoSearchDTO;
import com.boot.repository.EmployeeInfoRepository;
import com.boot.service.ElasticSearchService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElasticSearchServiceImpl implements ElasticSearchService {

    @Autowired
    private EmployeeInfoSearchRepository employeeInfoSearchRepository;

    @Autowired
    private EmployeeInfoRepository employeeInfoRepository;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public void index() {
        elasticsearchTemplate.deleteIndex("employee");
        employeeInfoRepository.findAll().forEach(e->{
            EmployeeInfoSearchDTO employeeInfoSearchDTO = new EmployeeInfoSearchDTO();
            BeanUtils.copyProperties(e,employeeInfoSearchDTO);
            employeeInfoSearchRepository.save(employeeInfoSearchDTO);
        });
        DeleteQuery deleteQuery = new DeleteQuery();
        elasticsearchTemplate.delete(deleteQuery);
    }

    @Override
    public List<EmployeeInfoSearchDTO> search() {
        GetQuery getQuery = new GetQuery();
        getQuery.setId("sadaferfwqdwqdwq");
        CriteriaQuery criteriaQuery = new CriteriaQuery(Criteria.where("sadsa").is(""));
        elasticsearchTemplate.queryForObject(criteriaQuery,EmployeeInfoSearchDTO.class);
        return null;
    }
}
