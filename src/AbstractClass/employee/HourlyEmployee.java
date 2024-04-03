package AbstractClass.employee;

public class HourlyEmployee extends Employee{
    public HourlyEmployee(int employeeId, String employeeName, int employeeAge){
        super(employeeId, employeeName, employeeAge);
    }

    @Override
    void calculatePay(int hours, int pay) {
        int totalPay=hours*pay;
        System.out.println("Your employee "+hours+" hours salary is "+totalPay);

    }

    @Override
    void getEmployeeDetails() {
        System.out.println("Employee Name "+employeeName+"E\nmployee Id is "+employeeId+"\nEmployee Age is "+employeeAge);
    }
}
