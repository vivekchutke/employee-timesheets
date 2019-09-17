package com.vivekchutke.microservice.employee.cfemployeetimesheetservice.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @NotNull
    @Column
    @Size(max = 15)
    private String firstName;
    @NotNull
    @Column
    @Size(max = 15)
    private String lastName;
    private Date dob;
    @NotNull
    @Column
    @Size(max = 15)
    private String userName;
    private String password;
    @NotNull
    @Column
    @Size(max = 12)
    private String phoneNumber;
    private Date doj;

    @Transient
    private String hostName;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", userName='" + userName + '\'' +
                ", doj='" + doj + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Employee(String firstName, String lastName, Date dob, String userName, String password, String phoneNumber, Date doj) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.doj = doj;
    }

    public Employee(){

    }

}