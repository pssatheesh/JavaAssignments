package InterfacesAssignment.library;

/*Design a library management system using packages. Create packages such as library.books , library.members , and library.transactions . Implement classes within these packages to represent books, members, and transactions. Demonstrate the usage of packages to organize the code logically.*/

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
