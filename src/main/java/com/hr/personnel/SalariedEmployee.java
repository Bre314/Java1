package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, LocalDate hireDate, double monthlySalary) {
        super(name, hireDate);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String work() {
        return getName() + " worked";
    }

    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }
}

