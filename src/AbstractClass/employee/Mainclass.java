package AbstractClass.employee;

public class Mainclass {
    public static void main(String[] args) {
        Employee emp=new HourlyEmployee(7151, "Arun", 25);
        emp.getEmployeeDetails();
        emp.calculatePay(10, 250);
        Employee emp1=new SalariedEmployee(7636, "Balaji", 30);
        emp1.getEmployeeDetails();
        emp1.calculatePay(28, 1000);
    }

}
