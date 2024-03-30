package InterfacesAssignment.library;


import InterfacesAssignment.library.books.Books;
import InterfacesAssignment.library.members.Members;
import InterfacesAssignment.library.members.Students;
import InterfacesAssignment.library.members.Teacher;

public class Library {
    public static void main(String[] args) {
        Members m=new Students();
        m.typeOfMembers();
        Members m1=new Teacher();
        m1.typeOfMembers();
        Members m2=new Books(101, "wings", "comic");
        m2.typeOfMembers();

    }
}
