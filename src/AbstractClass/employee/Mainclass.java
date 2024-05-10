package AbstractClass.employee;

/* Change Employee class as abstract and add abstract methods like calculatePay() with concrete methods like getEmployeeDetails(), etc. Extend this abstract class in subclasses - HourlyEmployee and SalariedEmployee. Allow the user to input details of employees and calculate their respective pay using the abstract class reference.*/


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
