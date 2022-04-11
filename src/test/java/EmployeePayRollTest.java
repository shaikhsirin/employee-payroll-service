import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class EmployeePayRollTest {
    @Test
    public void given3EmployeesStoreToFileShouldPassTest()
    {
        ArrayList<EmployeePayRoll> empPayRoll = new ArrayList<EmployeePayRoll>();
        empPayRoll.add(new EmployeePayRoll(1,"sirin",1000000));
        empPayRoll.add(new EmployeePayRoll(2,"saj",500000));
        EmployeePayRollService empPayRollService = new EmployeePayRollService(empPayRoll);
        empPayRollService.writeData("File");
        int entries = empPayRollService.noOfEntries("File");
        boolean result = entries==2 ? true : false;
        Assertions.assertTrue(result);
    }

    @Test
    public void given3EmployeesStoreToFileShouldPassTest()
    {
        ArrayList<EmployeePayRoll> empPayRoll = new ArrayList<EmployeePayRoll>();
        empPayRoll.add(new EmployeePayRoll(1,"sirin",1000000));
        empPayRoll.add(new EmployeePayRoll(2,"saj",500000));
        EmployeePayRollService empPayRollService = new EmployeePayRollService(empPayRoll);
        empPayRollService.writeData("File");
        int entries = empPayRollService.noOfEntries("File");
        boolean result = entries==2 ? true : false;
        Assertions.assertTrue(result);
    }

}
