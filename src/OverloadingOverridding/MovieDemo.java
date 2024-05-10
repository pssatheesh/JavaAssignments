package OverloadingOverridding;

/*Create hierarchy from Movie class with Child classes of different genre movies like RomComMovie, ThrillerMovie, etc. Demonstrate polymorphism using them.*/


class Movie{
    public void Success(){
        System.out.println("Movie is Blockbuster");
    }


}
class ComedyMovie extends Movie{
    public void Success(){
        System.out.println("Movie full of laughter");
    }

}
class ThillerMovie extends Movie{
    public void Success(){
        System.out.println("Movie full of thiller scences");
    }
}
public class MovieDemo {
    public static void main(String[] args) {
        Movie m=new ComedyMovie();
        m.Success();
        Movie t=new ThillerMovie();
        t.Success();
    }
}
