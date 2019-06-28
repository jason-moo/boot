package com.test.es.service.impl;

import com.test.es.entity.EmployeeInfo;
import com.test.es.entity.EmployeeInfoSearchDTO;
import com.test.es.esRepository.EmployeeInfoSearchRepository;
import com.test.es.repository.EmployeeInfoRepository;
import com.test.es.service.ElasticSearchService;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        employeeInfoRepository.findAll().forEach(
            e -> {
                EmployeeInfoSearchDTO employeeInfoSearchDTO = new EmployeeInfoSearchDTO();
                BeanUtils.copyProperties(e, employeeInfoSearchDTO);
                employeeInfoSearchRepository.save(employeeInfoSearchDTO);
            }
        );
    }

    @Override
    public void builk() {
        List<EmployeeInfo> employeeInfos = IterableUtils.toList(employeeInfoRepository.findAll());
        List<IndexQuery> indexQueries = employeeInfos.parallelStream().map(e -> {
            IndexQuery indexQuery = new IndexQuery();
            EmployeeInfoSearchDTO employeeInfoSearchDTO = new EmployeeInfoSearchDTO();
            BeanUtils.copyProperties(e, employeeInfoSearchDTO);
            indexQuery.setObject(employeeInfoSearchDTO);
            indexQuery.setId(e.getId());
            indexQuery.setIndexName("employee");
            indexQuery.setType("employee");
            return indexQuery;
        }).collect(Collectors.toList());
        elasticsearchTemplate.bulkIndex(indexQueries);
        //        SumAggregationBuilder sb = AggregationBuilders.sum("tpPrice").field("payPrice");
//        BoolQueryBuilder bqb = QueryBuilders.boolQuery();
//        bqb.must(QueryBuilders.boolQuery()
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_TL))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_TL_WX_APP))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_TL_ALI))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_TL_WX_JS))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_TL_APP))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_TL_WX_H5))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_WX_GWORLD))
//                .should(QueryBuilders.matchQuery("payPlatform", SuperAppConstant.PAY_PLATFORM_ALI_GWORLD))
//        );
//        SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(bqb).withIndices(SuperAppConstant.ES_INDEX_NAME).withTypes(SuperAppConstant.ES_PAY_TYPE)
//                .withSearchType(SearchType.DEFAULT)
//                .addAggregation(sb).build();
    }
}
