package com.zipcode.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zipcode.details.Zipcode;

public interface zip extends MongoRepository<Zipcode, Integer>{

}
