package com.vivekchutke.microservice.employee.cfemployeetimesheetservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "timesheet")
public class Timesheet extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne(fetch=FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Employee employee;

    private int weekOfTheYear;
    private int monday;
    private int tuesday;
    private int wednesday;
    private int thursday;
    private int friday;
    private int saturday;
    private int sunday;
    private int totalHrs;
    private Date weekStartDate;
    private Date weekEndDate;

    public Timesheet() {

    }

    public Timesheet(Integer id, int weekOfTheYear, int monday, int tuesday, int wednesday, int thursday, int friday, int saturday, int sunday, int totalHrs, Date weekStartDate, Date weekEndDate) {
        Id = id;
        this.weekOfTheYear = weekOfTheYear;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
        this.totalHrs = totalHrs;
        this.weekStartDate = weekStartDate;
        this.weekEndDate = weekEndDate;
    }

    @Override
    public String toString() {
        return "Timesheet{" +
                "Id=" + Id +
                ", weekOfTheYear=" + weekOfTheYear +
                ", monday=" + monday +
                ", tuesday=" + tuesday +
                ", wednesday=" + wednesday +
                ", thursday=" + thursday +
                ", friday=" + friday +
                ", saturday=" + saturday +
                ", sunday=" + sunday +
                ", totalHrs=" + totalHrs +
                ", weekStartDate=" + weekStartDate +
                ", weekEndDate=" + weekEndDate +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public int getWeekOfTheYear() {
        return weekOfTheYear;
    }

    public void setWeekOfTheYear(int weekOfTheYear) {
        this.weekOfTheYear = weekOfTheYear;
    }

    public int getMonday() {
        return monday;
    }

    public void setMonday(int monday) {
        this.monday = monday;
    }

    public int getTuesday() {
        return tuesday;
    }

    public void setTuesday(int tuesday) {
        this.tuesday = tuesday;
    }

    public int getWednesday() {
        return wednesday;
    }

    public void setWednesday(int wednesday) {
        this.wednesday = wednesday;
    }

    public int getThursday() {
        return thursday;
    }

    public void setThursday(int thursday) {
        this.thursday = thursday;
    }

    public int getFriday() {
        return friday;
    }

    public void setFriday(int friday) {
        this.friday = friday;
    }

    public int getSaturday() {
        return saturday;
    }

    public void setSaturday(int saturday) {
        this.saturday = saturday;
    }

    public int getSunday() {
        return sunday;
    }

    public void setSunday(int sunday) {
        this.sunday = sunday;
    }

    public int getTotalHrs() {
        return totalHrs;
    }

    public void setTotalHrs(int totalHrs) {
        this.totalHrs = totalHrs;
    }

    public Date getWeekStartDate() {
        return weekStartDate;
    }

    public void setWeekStartDate(Date weekStartDate) {
        this.weekStartDate = weekStartDate;
    }

    public Date getWeekEndDate() {
        return weekEndDate;
    }

    public void setWeekEndDate(Date weekEndDate) {
        this.weekEndDate = weekEndDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
