package com.hr.personnel;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate hireDate;

    // Constructor
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for hireDate
    public LocalDate getHireDate() {
        return hireDate;
    }

    // Setter for hireDate
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    // Method to get employee info
    public String getEmployeeInfo() {
        return "name = " + name + ", hireDate = " + hireDate;
    }

    public String work() {
        return name + " worked";
    }
    // Method to compute monthly compensation
    public double computeMonthlyCompensation() {
        return 0.0;
    }
}
