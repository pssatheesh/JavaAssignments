package ArrayListAssignment;

import java.util.*;

/* Write a program that sorts an ArrayList of custom objects based on a specific property using a custom comparator class implementing the Comparator interface.*/

public class SortingArraylist {
    public static void main(String[] args) {
        List<Book> bookList=new ArrayList<>();
        bookList.add(new Book(201,"Wings", "APJ", 2001));
        bookList.add(new Book(202,"Ramayanam", "Kalki", 1995));
        bookList.add(new Book(203,"Mahabarath", "valmiki", 1996));

        Comparator<Book> cmp=Comparator.comparing(Book ::getTitle);
        Collections.sort(bookList, cmp);
        for(Book book:bookList){
            System.out.println(book);
        }
    }
}
