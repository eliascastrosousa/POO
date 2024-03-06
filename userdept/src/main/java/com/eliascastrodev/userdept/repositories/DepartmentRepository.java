package com.eliascastrodev.userdept.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.eliascastrodev.userdept.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}