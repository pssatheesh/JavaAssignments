package CombinedAssignment_2;
//Write two DTO classes to exhibit the has-a relationship given in the diagram.
class Player{
    private String name;
    private String position;
    private int jerseyNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    void playGame(){
        System.out.println("Playing");
    }
    void train(){
        System.out.println("Train the players");
    }
}
public class Team {
    private String name;
    private String city;
    private String division;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    void playGame(){
        System.out.println("Playing game");
    }
    void hireCoach(){
        System.out.println("Hiring for CricketCoach");
    }
}
