package InterfacesAssignment.library.books;

import InterfacesAssignment.library.members.Members;

public class Books implements Members {
    private int bookId;
    private String bookName;
    private String genre;

    public Books(int bookId, String bookName, String genre) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.genre = genre;
    }

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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void typeOfMembers() {
        System.out.println("Book details are "+getBookId()+"\t"+getBookName()+"\t"+getGenre());

    }
}
