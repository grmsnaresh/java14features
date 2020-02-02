package com.grms.java14.features.domain;

/**
 * Created by grmsnaresh on 02-02-2020.
 */
public class Employee extends User {
    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeDetails() {
        return "I am employee";
    }
}
