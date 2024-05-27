package ArrayListAssignment;

public class Book {
    int bookId;
    String title;
    String author;
    int publishedYear;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Book(int bookId, String title, String author, int publishedYear) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return  bookId + " \t " +
                title + " \t " +
                author + " \t " +
                publishedYear;
    }
}
