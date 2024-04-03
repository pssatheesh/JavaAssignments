package AbstractClass.employee;

public class SalariedEmployee extends Employee{
    public SalariedEmployee(int employeeId, String employeeName, int employeeAge){
        super(employeeId, employeeName, employeeAge);
    }
    @Override
    void calculatePay(int days, int pay) {
        int totalPay=days*pay;
        System.out.println("Your employee "+days+" days salary is "+totalPay);

    }

    @Override
    void getEmployeeDetails() {
        System.out.println("Employee Name "+employeeName+"E\nmployee Id is "+employeeId+"\nEmployee Age is "+employeeAge);
    }
}
