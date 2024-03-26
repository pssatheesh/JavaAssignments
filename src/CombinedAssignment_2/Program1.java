package CombinedAssignment_2;

/*Create Book DTO class with attributes like title, ISBN etc.
Create appropriate instance variables, static variables and methods with appropriate access modifiers*/
class Program1 {
    String title="Satheesh Book Shop";
    String ISBN="ISBN987655";
    static int year;
    static String Publication="red";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        Program1.year = year;
    }

    public static String getPublication() {
        return Publication;
    }

    public static void setPublication(String publication) {
        Publication = publication;
    }

    public Program1(String title, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
    }
}
