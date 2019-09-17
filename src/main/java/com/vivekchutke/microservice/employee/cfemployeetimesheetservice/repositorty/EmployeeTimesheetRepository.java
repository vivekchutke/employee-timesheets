package com.vivekchutke.microservice.employee.cfemployeetimesheetservice.repositorty;

import com.vivekchutke.microservice.employee.cfemployeetimesheetservice.entity.Timesheet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface EmployeeTimesheetRepository extends JpaRepository<Timesheet, Integer> {

//    List<Timesheet> findAllByEmployeeId(Integer employeeId);
//    Page<Timesheet> findByEmployeeId(Integer employeeId, Pageable pageable);
//    Optional<Timesheet> findByIdAndEmployeeId(Integer id, Long employeeId);
}
