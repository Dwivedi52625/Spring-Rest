package com.userlogin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.userlogin.entity.User;
@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
