package com.vivekchutke.microservice.employee.cfemployeetimesheetservice.controller;

import com.vivekchutke.microservice.employee.cfemployeetimesheetservice.entity.Timesheet;
import com.vivekchutke.microservice.employee.cfemployeetimesheetservice.repositorty.EmployeeRepository;
import com.vivekchutke.microservice.employee.cfemployeetimesheetservice.repositorty.EmployeeTimesheetRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeTimesheetController implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(EmployeeTimesheetController.class);

    @Autowired
    private EmployeeTimesheetRepository employeeTimesheetRepository;

    @Autowired
    private EmployeeRepository employeeRepository;
//
//    @GetMapping("/timesheet/employee/{employeeId}")
//    public Timesheet getAllTimeSheets(@PathVariable Integer employeeId) {
//        Timesheet timesheets = employeeTimesheetRepository.findByEmployeeid(employeeId);
//        logger.info("Timesheets value is**:"+timesheets);
//        return timesheets;
//    }

//    @GetMapping("/timesheet/employee/{employeeId}")
//    public List<Timesheet> getAllTimeSheets(@PathVariable Integer employeeId) {
//        List timesheets = employeeTimesheetRepository.findAllByEmployeeId(employeeId);
//
//        logger.info("Timesheets value is**:"+timesheets);
//        return timesheets;
//    }

//    @GetMapping("/timesheet/{Id}")
//    public Optional<Timesheet> getTimeSheetById(@PathVariable  Integer Id){
//        logger.info("TimeSheet Id is: "+Id);
//        return employeeTimesheetRepository.findById(Id);
//    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Pre inserting an employee TimeSheet ");
//        Timesheet timesheet = new Timesheet();
//        timesheet.setMonday(8);
//        timesheet.setTuesday(8);
//        timesheet.setWednesday(8);
//        timesheet.setThursday(8);
//        timesheet.setFriday(8);
//        timesheet.setSaturday(0);
//        timesheet.setSunday(0);
//        timesheet.setTotalHrs(40);
//        timesheet.setWeekStartDate(new Date());
//        timesheet.setWeekEndDate(new Date());
//        timesheet.setWeekOfTheYear(2);
//        timesheet.setEmployee(employeeRepository.findById(1).get());
//
//        Timesheet timesheet1 = new Timesheet();
//        timesheet1.setMonday(8);
//        timesheet1.setTuesday(8);
//        timesheet1.setWednesday(8);
//        timesheet1.setThursday(8);
//        timesheet1.setFriday(0);
//        timesheet1.setSaturday(0);
//        timesheet1.setSunday(0);
//        timesheet1.setTotalHrs(32);
//        timesheet1.setWeekStartDate(new Date());
//        timesheet1.setWeekEndDate(new Date());
//        timesheet1.setWeekOfTheYear(3);
//        timesheet1.setEmployee(employeeRepository.findById(1).get());
//
//
//        employeeTimesheetRepository.save(timesheet);
//        employeeTimesheetRepository.save(timesheet1);
    }
}
