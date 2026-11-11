package Employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        //arrange
        Employee employee = new Employee("E001", "Rosie", "Software Testing", 30.50, 0);

        //act
        employee.punchIn(8);

        //assert
        assertEquals(8, employee.getStartTime());
    }

    @Test
    void punchOut() {
        //arrange
        Employee employee = new Employee("E001", "Rosie", "Software Testing", 30.50, 0);
        employee.punchIn(8);

        //act
        employee.punchOut(17);

        //assert
        assertEquals(9,employee.getHoursWorked());
    }
}