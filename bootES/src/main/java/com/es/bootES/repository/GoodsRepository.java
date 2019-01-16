package com.es.bootES.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import com.es.bootES.entity.GoodsInfo;

@Component
public interface GoodsRepository extends ElasticsearchRepository<GoodsInfo, Long> {
}