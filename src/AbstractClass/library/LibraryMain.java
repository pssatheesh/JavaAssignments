package AbstractClass.library;

import java.util.ArrayList;
import java.util.Scanner;

class check extends Library{
    public check(int bookId, String bookName, int bookCount) {
        super(bookId, bookName, bookCount);
    }

    @Override
    boolean LoginCode(String username, String password) {
        if(username.equals("admin") && password.equals("admin")){
            return true;
        }
        return false;
    }
    private Library library;
    private ArrayList<Library> booklist=new ArrayList<>();
    @Override
    public void addbook() {
        booklist.add(library);
        System.out.println("Book added successfully");
    }

}
public class LibraryMain{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the username");
        String username=scanner.next();
        System.out.println("Enter the password");
        String password=scanner.next();
        Library lib=new check(101,"Wildcraft", 5);
        boolean res=lib.LoginCode(username, password);
        if(res){
            lib.addbook();
        }else{
            System.out.println("Invalid Credential");
        }


    }
}

