package ConstructorsAssignment;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int bookId;
    private String bookName;
    private String publication;
    private String bookGenre;
    private int bookCount;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public Book(int bookId, String bookName, String publication, String bookGenre, int bookCount) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.publication = publication;
        this.bookGenre = bookGenre;
        this.bookCount = bookCount;
    }

    @Override
    public String toString() {
        return "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", publication='" + publication + '\'' +
                ", bookGenre='" + bookGenre + '\'' +
                ", bookCount=" + bookCount ;
    }

    private static void getBookDetails(List<Book> list) {
        for(Book book:list){
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        List<Book> list=new ArrayList<>();
        list.add(new Book(101,"wings of fire", "RedGiant", "comedy",10));
        getBookDetails(list);
    }


}

