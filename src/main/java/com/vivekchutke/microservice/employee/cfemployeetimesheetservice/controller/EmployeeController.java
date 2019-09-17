package com.vivekchutke.microservice.employee.cfemployeetimesheetservice.controller;


import com.vivekchutke.microservice.employee.cfemployeetimesheetservice.entity.Employee;
import com.vivekchutke.microservice.employee.cfemployeetimesheetservice.exception.EmployeeNotFoundException;
import com.vivekchutke.microservice.employee.cfemployeetimesheetservice.repositorty.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.util.Date;
import java.util.List;
import java.util.Optional;

//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@RestController
//@EnableDiscoveryClient
public class EmployeeController implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private Environment environment;

    @PostMapping("/employee")
    public Employee insertEmployee(@RequestBody Employee employee) {
        logger.info("Inserting a new employee");
        employee = employeeRepository.save(employee);
        return employee;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        logger.info("Retreiving all employees");
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @GetMapping("/employee/{Id}")
    public Optional<Employee> retrieveEmployeebyId(@PathVariable Integer Id)  {
        Optional<Employee> employeeOptional = employeeRepository.findById(Id);
        Integer portNumber = Integer.parseInt(environment.getProperty("local.server.port"));
        String hostName = environment.getProperty("local.server.hostname");
        logger.info("Port Number is: "+portNumber);

//        try {
//
//            logger.info("InetAddress.getLocalHost().getHostAddress() : "+InetAddress.getLocalHost().getHostAddress());
//            logger.info("InetAddress.getLocalHost().getHostName() : "+InetAddress.getLocalHost().getHostName());
//            logger.info("InetAddress.getLocalHost().getHostName() : "+InetAddress.getLocalHost().getCanonicalHostName());
//            logger.info("InetAddress.getLocalHost().getHostName() : "+InetAddress.getLocalHost().getAddress());
////            logger.info("InetAddress.getLocalHost().getHostName() : "+InetAddress.getLocalHost().get());
//        } catch(Exception ex) {
//
//        }

        logger.info("Employee Data is: "+employeeOptional);
        if(employeeOptional != null && !employeeOptional.isPresent()) {
            logger.info("No Employee with this employee Id: "+Id);
            throw new EmployeeNotFoundException("UserName Not found :" + Id);
        }
        return employeeOptional;
    }


    @GetMapping("/employeeName/{userName}")
    public Employee retrieveEmployeeByuserName(@PathVariable String userName)  {
        Employee employee = employeeRepository.findByUserName(userName);
        if(employee ==null)
            throw new EmployeeNotFoundException("User_Id Not found :"+userName);
        return employee;
    }

    @GetMapping("/employee")
    public Employee getEmployeeByUserNameAndPassword(@RequestParam(required = true) String userName, @RequestHeader String password) {

        logger.info("In UserName and Password Validation method");

        Employee employee = employeeRepository.findByUserNameAndPassword(userName, password);
        if(employee ==null)
            throw new EmployeeNotFoundException("User_Id Not found :"+userName);
        return employee;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Pre inserting an employee");
        Employee employee1 = new Employee();
        employee1.setFirstName("Vivek");
        employee1.setDob(new Date());
        employee1.setLastName("Chutke");
        employee1.setPassword("test123");
        employee1.setPhoneNumber("9259641456");
        employee1.setUserName("vchutke");
        employee1.setDoj(new Date());
        employeeRepository.save(employee1);

    }

}