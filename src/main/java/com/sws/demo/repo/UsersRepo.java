package com.sws.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sws.demo.entity.Users;

@Repository
public interface UsersRepo extends MongoRepository<Users, String> {

}
