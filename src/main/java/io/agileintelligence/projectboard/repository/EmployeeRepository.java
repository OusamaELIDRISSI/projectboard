package io.agileintelligence.projectboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.agileintelligence.projectboard.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}