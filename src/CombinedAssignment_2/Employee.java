package CombinedAssignment_2;
/* Create an Employee DTO class. Create appropriate instance variables, static variables and methods with appropriate access modifiers. Maintain encapsulation by giving controlled access to employee's PII.*/
public class Employee {
    private int employeeId;
    private String employeeName;
    private long employeeMobile;
    private String bloodGroup;
    static String companyName="AAA";

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getEmployeeMobile() {
        return employeeMobile;
    }

    public void setEmployeeMobile(long employeeMobile) {
        this.employeeMobile = employeeMobile;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    public Employee(int employeeId, String employeeName, long employeeMobile, String bloodGroup) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeMobile = employeeMobile;
        this.bloodGroup = bloodGroup;
    }
}
