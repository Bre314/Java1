package com.hr.personnel;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommissionedEmployeeTest {

    @Test
    void computeMonthlyCompensation_shouldReturnCorrectCompensation() {
        // Arrange
        CommissionedEmployee emp = new CommissionedEmployee("Alice", LocalDate.of(2021, 1, 15), 0.10);

        // Add some sales
        emp.addSale(1000);
        emp.addSale(1500);
        emp.addSale(2000);

        // Act
        double compensation = emp.computeMonthlyCompensation();

        // Assert
        assertEquals(450.0, compensation); // (0.10 * (1000 + 1500 + 2000)) = 450.0
    }
}

