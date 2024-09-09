package com.hr.personnel;

import java.time.LocalDate;
import java.util.ArrayList;

public class CommissionedEmployee extends Employee {
    private double commissionRate;
    private ArrayList<Double> monthlySales;

    public CommissionedEmployee(String name, LocalDate hireDate, double commissionRate) {
        super(name, hireDate);
        this.commissionRate = commissionRate;
        this.monthlySales = new ArrayList<>();
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public ArrayList<Double> getMonthlySales() {
        return monthlySales;
    }

    public void addSale(double saleAmount) {
        this.monthlySales.add(saleAmount);
    }

    @Override
    public String getEmployeeInfo() {
        return "";
    }

    @Override
    public String work() {
        return getName() + " worked as a commissioned employee.";
    }

    @Override
    public double computeMonthlyCompensation() {
        return commissionRate * monthlySales.stream().mapToDouble(Double::doubleValue).sum();
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return 0;
    }
}

