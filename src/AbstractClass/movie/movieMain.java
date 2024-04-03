package AbstractClass.movie;

class HollywoodMovie extends Movie{

    public HollywoodMovie(String movieName, String movieGenre, int ticketPrice) {
        super(movieName, movieGenre, ticketPrice);
    }

    @Override
    void getDisplay() {
        System.out.println("\n\nHollywood Movie details are");
        System.out.println("Movie Name is "+getMovieName());
        System.out.println("Movie Genre is "+getMovieGenre());
        System.out.println("Ticket price is "+getTicketPrice());
    }
}
class TamilMovie extends Movie{

    public TamilMovie(String movieName, String movieGenre, int ticketPrice) {
        super(movieName, movieGenre, ticketPrice);
    }

    @Override
    void getDisplay() {
        System.out.println("\n\nTamil Movie details are");
        System.out.println("Movie Name is "+getMovieName());
        System.out.println("Movie Genre is "+getMovieGenre());
        System.out.println("Ticket price is "+getTicketPrice());
    }
}
class AnimationMovie extends Movie{

    public AnimationMovie(String movieName, String movieGenre, int ticketPrice) {
        super(movieName, movieGenre, ticketPrice);
    }

    @Override
    void getDisplay() {
        System.out.println("\n\nAnimation Movie details are");
        System.out.println("Movie Name is "+getMovieName());
        System.out.println("Movie Genre is "+getMovieGenre());
        System.out.println("Ticket price is "+getTicketPrice());
    }
}
public class movieMain {
    public static void main(String[] args) {
        Movie tm=new TamilMovie("Jailer","comedy", 200);
        tm.getDisplay();
        Movie hm=new HollywoodMovie("Avatar", "thiriler", 250);
        hm.getDisplay();
        Movie am=new AnimationMovie("Darbar", "serial", 150);
        am.getDisplay();
    }
}
