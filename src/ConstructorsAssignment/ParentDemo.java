package ConstructorsAssignment;

/* Design a Student Parent class and ZSGSStudent Child class. Create constructors in both class with varying number of parameters. Call parent constructor from child constructor. Try experimenting by creating child object using parent constructor.*/


import CombinedAssignment_2.Employee;

class Student{
    int studentId;
    String studentName;
    String studentEmail;
    static String schoolName="ZSGS";
    public Student(int studentId, String studentName, String studentEmail){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentEmail=studentEmail;
    }
    void display(){
        System.out.println("Students details are");
        System.out.println(schoolName+"\t"+studentId+"\t"+studentName+"\t"+studentEmail);
    }

}

class ZSGSStudent extends Student{
    double percentage;
    public ZSGSStudent(int studentId, String studentName, String studentEmail, double percentage){
        super( studentId, studentName, studentEmail);
    }
    void display(){
        System.out.println("Students details are");
        System.out.println(schoolName+"\t"+studentId+"\t"+studentName+"\t"+studentEmail+"\t"+percentage);
    }
}
public class ParentDemo {
    public static void main(String[] args) {
        Student st=new Student(101, "Satheesh", "abcd@gmail.com");
        st.display();
        Student st1=new ZSGSStudent(102, "Balaji","abcdef@gmail.com", 93.4);
        st1.display();

    }
}
