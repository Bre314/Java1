package com.hr.personnel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentTest {

    private Department department;

    @BeforeEach
    public void setUp() {
        department = new Department("Engineering", "New York");
    }

    @Test
    public void testAddEmployee() {
        // Arrange
        SalariedEmployee salariedEmployee = new SalariedEmployee("John Doe", LocalDate.of(2020, 01, 01), 5000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane Smith", LocalDate.of(2019, 05, 15), 160, 25);

        // Act
        department.addEmployee(salariedEmployee);
        department.addEmployee(hourlyEmployee);

        // Assert
        // Since we're adding two employees, currentIndex should be 2
        assertEquals(2, department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked());
    }

    @Test
    public void testLetEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        // Arrange
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("John Doe", LocalDate.of(2020, 01, 01), 5000);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Jane Smith", LocalDate.of(2019, 05, 15), 6000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mark Brown", LocalDate.of(2021, 03, 20), 160, 25);

        department.addEmployee(salariedEmployee1);
        department.addEmployee(salariedEmployee2);
        department.addEmployee(hourlyEmployee);

        // Act
        int employeesWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();

        // Assert
        assertEquals(3, employeesWorked);
    }

    @Test
    public void testComputeMonthlyCompensationForSalariedEmployee() {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John Doe", LocalDate.of(2020, 1, 1), 5000);
        assertEquals(5000, salariedEmployee.computeMonthlyCompensation());
    }

    @Test
    public void testComputeMonthlyCompensationForHourlyEmployee() {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mark Brown", LocalDate.of(2021, 3, 20), 160, 25);
        assertEquals(4000, hourlyEmployee.computeMonthlyCompensation());
    }

}

