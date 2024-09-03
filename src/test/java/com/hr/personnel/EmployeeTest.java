package com.hr.personnel;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    @Test
     void getEmployeeInfo_shouldReturnCorrectInfo(){
        Employee emp = new Employee("Mike", LocalDate.of(2020,3,14));
        assertEquals("name = Mike, hireDate = 2020-03-14", emp.getEmployeeInfo());
    }
    @Test
    void work_shouldReturnCorrectWorkMessage(){
        Employee emp = new Employee("Mike", LocalDate.of(2020,3,14));
        assertEquals("Mike worked", emp.work());
    }
}
