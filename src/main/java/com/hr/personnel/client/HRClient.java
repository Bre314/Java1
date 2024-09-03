package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.SalariedEmployee;
import com.hr.personnel.HourlyEmployee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Department department = new Department("Engineering", "New York");

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("John Doe", LocalDate.of(2020,01,01), 5000);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Jane Smith", LocalDate.of(2019,05,15), 6000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mark Brown", LocalDate.of(2021,03,20), 160, 25);

        department.addEmployee(salariedEmployee1);
        department.addEmployee(salariedEmployee2);
        department.addEmployee(hourlyEmployee);

        double totalCompensation = department.computeDepartmentMonthlyTotalCompensation();
        System.out.println("Total monthly compensation for the department: " + totalCompensation);
    }
}


