package AbstractClass.library;

abstract class Library {
    int bookId;
    String bookName;
    int bookCount;

    public Library(int bookId, String bookName, int bookCount) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookCount = bookCount;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookCount() {
        return bookCount;
    }

     abstract boolean LoginCode(String username, String password);

    public abstract void addbook();

}
