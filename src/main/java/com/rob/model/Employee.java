package com.rob.model;

import com.rob.constants.EmpType;

import java.util.Date;

/**
 * Created by robinmathur on 03/08/16.
 */
public class Employee {
    private int empId;
    private String empName;
    private Date empDOB;
    private EmpType empType;
    private boolean active;


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDOB() {
        return empDOB;
    }

    public void setEmpDOB(Date empDOB) {
        this.empDOB = empDOB;
    }

    public EmpType getEmpType() {
        return empType;
    }

    public void setEmpType(EmpType empType) {
        this.empType = empType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDOB=" + empDOB +
                ", empType=" + empType +
                ", active=" + active +
                '}';
    }
}

