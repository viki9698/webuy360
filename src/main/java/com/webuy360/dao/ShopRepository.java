package com.webuy360.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShopRepository extends MongoRepository<Shop, String> {

    public User findByName(String name);
}
