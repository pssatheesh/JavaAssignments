package AbstractClass.employee;

public abstract class Employee {
    int employeeId;
    String employeeName;
    int employeeAge;
    public Employee(int employeeId, String employeeName, int employeeAge){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeAge=employeeAge;
    }
    abstract void calculatePay(int hours, int pay);
    abstract void getEmployeeDetails();
}
