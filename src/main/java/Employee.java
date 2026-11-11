import java.time.LocalDateTime;

public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int startTime;

    public Employee (String employeeId, String name, String department, double payRate, int hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId(){
        return employeeId;
    }
    public void setName(String name){

    }
    public String getDepartment(){
        return department;
    }
    public double getPayRate(){
        return payRate;
    }
    public int getHoursWorked(){
        return hoursWorked;
    }
    public void punchIn(int time){
        startTime = time;
    }
    public void punchIn(){
        LocalDateTime time = LocalDateTime.now();
        time.getHour();
        time.getMinute();

    }
    public void punchOut(int outTime){
        int hoursToday = outTime - startTime;
        hoursWorked =  hoursWorked + hoursToday;
    }
    public void punchOut(){
        LocalDateTime outTime = LocalDateTime.now();
        outTime.getHour();
        outTime.getMinute();
    }



}
