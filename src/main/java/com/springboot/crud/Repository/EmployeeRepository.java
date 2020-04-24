package com.springboot.crud.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.Model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}