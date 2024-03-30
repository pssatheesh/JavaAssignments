package InterfacesAssignment.university;

import InterfacesAssignment.university.courses.Courses;
import InterfacesAssignment.university.courses.Display;
import InterfacesAssignment.university.faculty.Facultymembers;
import InterfacesAssignment.university.student.Student;

public class UniversityManagement {
    public static void main(String[] args) {
        Display d=new Courses(5121, "Electronics", 35000);
        d.print();
        Display d1=new Facultymembers(9231,"Giri","B",9087653);
        d1.print();
        Display d2=new Student("Chandru",321,24,"O");
        d2.print();

    }
}
