package com.studease;

import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * Created by Shaoping Liu<spieled916@gmail.com> on 2016-12-11 23:18.
 */
public interface VisitorRepository extends MongoRepository<Visitor,String> {}
