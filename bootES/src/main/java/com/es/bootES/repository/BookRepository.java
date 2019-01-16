package com.es.bootES.repository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.es.bootES.entity.Book;

public interface BookRepository extends ElasticsearchRepository<Book,String>{

}