package AbstractClass.movie;

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
