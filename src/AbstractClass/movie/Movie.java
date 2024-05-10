package AbstractClass.movie;

/*Change 'Movie' class to abstract class and add additional abstract methods in 'Movie' class and define them in the child classes*/


abstract class Movie {
    String movieName;
    String movieGenre;
    int ticketPrice;

    public Movie(String movieName, String movieGenre, int ticketPrice) {
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.ticketPrice = ticketPrice;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    abstract void getDisplay();
}
