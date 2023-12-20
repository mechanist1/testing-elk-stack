package com.example.elk;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.support.ElasticsearchEntityInformation;
import org.springframework.stereotype.Repository;

public interface UserRepo extends ElasticsearchRepository<User,Long> {
}
