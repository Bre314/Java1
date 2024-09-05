package com.hr.personnel;

import java.time.LocalDate;

public abstract class Employee {
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
    public abstract String getEmployeeInfo();

    public abstract String work();

    // Method to compute monthly compensation
    public abstract double computeMonthlyCompensation();
}
