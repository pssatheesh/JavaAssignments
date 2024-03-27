package ConstructorsAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class User{
    private String name;
    private int id;
    void verify(){
    }
    void checkAccount(){

    }
    void get_book_info(){

    }
}
class book{
    private String Title;
    private String ISBN;
    private String Author;
    private String publication;
    void show_duedt(){ }
    void reservation_status(){ }
    void feedback(){ }
    void book_request(){ }
    void renew_info(){ }
}
class Librarian{
    private int id;
    private String Name;
    private String password;
    private String searchString;
    void verifyLibrarian(){ }
    void search(){ }
}
class LibraryDatabase{
    List<book> bookList=new ArrayList<>();
    void bookAdd(){ }
    void bookupdate(){ }
    void bookDelete(){ }
    void display(){ }
    void bookSearch(){ }
}
class Accounts{
    private int no_borrowed_Book;
    private int no_reserved_Book;
    private int no_returned_Book;
    private int no_lost_Book;
    private int fine_amount;
    void calculateFine(){ }
}
public class LibraryManagementSystem {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("Welcome to Library");
            System.out.println("\n1.Login\n2.Register\n3.logout");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    logout();
                    break;
                default:
                    break;
            }
        }
    }



    private static void login() {

    }
    private static void register(){

    }
    private static void logout() {
    }
}
