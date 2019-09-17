package com.vivekchutke.microservice.employee.cfemployeetimesheetservice.repositorty;

import com.vivekchutke.microservice.employee.cfemployeetimesheetservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


    Employee findByUserName(String userName);

    Employee findByUserNameAndPassword(String userName, String password);
}