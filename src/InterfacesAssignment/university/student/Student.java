package InterfacesAssignment.university.student;

import InterfacesAssignment.university.courses.Display;

public class Student implements Display {
    private String studentName;
    private int studentId;
    private int studentAge;
    private String studentBlood;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentBlood() {
        return studentBlood;
    }

    public void setStudentBlood(String studentBlood) {
        this.studentBlood = studentBlood;
    }

    public Student(String studentName, int studentId, int studentAge, String studentBlood) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAge = studentAge;
        this.studentBlood = studentBlood;
    }

    @Override
    public void print() {
        System.out.println("Students details are ");
        System.out.println("Student Name "+getStudentName()+"\t"+"Student Id "+getStudentId()+"\t"+"Student Age "+getStudentAge()+"\t"+"Student Blood Group "+getStudentBlood());
    }
}
