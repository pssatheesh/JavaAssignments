package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Scanner;

/*. Create ArrayList of the book class (ArrayList<Book>) in main method. Add methods to add books to the ArrayList*/

public class Mainclass {
    public static void main(String[] args) {
        ArrayList<Book> booklist=new ArrayList<>();
        addBook(booklist, 101,"Science","Praveen", 2001);
        addBook(booklist, 102,"Maths","Ramesh", 2010);
        addBook(booklist,103,"Biology","JP", 2007);
        addBook(booklist, 104,"Electronics","Karupasamy", 2018);

        for(Book book:booklist){
            System.out.println(book);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Book Name to remove");
        String removebook=scanner.next();

        removeBook(booklist, removebook);
        for(Book book:booklist){
            System.out.println(book);
        }
    }
    static void addBook(ArrayList<Book> booklist, int bookId, String title, String author, int publishedYear ){
        Book book=new Book(bookId, title, author, publishedYear);
        booklist.add(book);
    }
    static void removeBook(ArrayList<Book> booklist, String title){
        Book bookRemove=null;
        for(Book book:booklist){
            if(book.getTitle().equals(title)) {
                bookRemove = book;
                break;
            }
        }
        if(bookRemove!=null){
            booklist.remove(bookRemove);
        }else{
            System.out.println("There is no book to remove");
        }
    }
}
