package CombinedAssignment_2;

public class Movie {
    private String movieName;
    private int movieRating;
    private int numberOfDaysRunning;
    private String bookingDetails;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    public int getNumberOfDaysRunning() {
        return numberOfDaysRunning;
    }

    public void setNumberOfDaysRunning(int numberOfDaysRunning) {
        this.numberOfDaysRunning = numberOfDaysRunning;
    }

    public String getBookingDetails() {
        return bookingDetails;
    }

    public void setBookingDetails(String bookingDetails) {
        this.bookingDetails = bookingDetails;
    }

    public Movie(String movieName, int movieRating, int numberOfDaysRunning, String bookingDetails) {
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.numberOfDaysRunning = numberOfDaysRunning;
        this.bookingDetails = bookingDetails;
    }
}
