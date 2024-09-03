package com.hr.personnel;

public class Department {
    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public double computeDepartmentMonthlyTotalCompensation() {
        double totalCompensation = 0.0;
        for (int i = 0; i < currentIndex; i++) {
            totalCompensation += employees[i].computeMonthlyCompensation();
        }
        return totalCompensation;
    }

    public void addEmployee(Employee employee) {
        if (currentIndex < employees.length) {
            employees[currentIndex] = employee;
            currentIndex++;
        }
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int count = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (employees[i].work().contains("worked")) {
                count++;
            }
        }
        return count;
    }
}


