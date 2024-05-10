package CombinedAssignment_2;
//Create Flight DTO class. Create appropriate instance variables, static variables and methods with appropriate access modifiers.
public class Flight {
    private String flightName;
    private String flightModel;
    private String source;
    private String destiation;
    private String seatCapacity;

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightModel() {
        return flightModel;
    }

    public void setFlightModel(String flightModel) {
        this.flightModel = flightModel;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestiation() {
        return destiation;
    }

    public void setDestiation(String destiation) {
        this.destiation = destiation;
    }

    public String getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(String seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public Flight(String flightName, String flightModel, String source, String destiation, String seatCapacity) {
        this.flightName = flightName;
        this.flightModel = flightModel;
        this.source = source;
        this.destiation = destiation;
        this.seatCapacity = seatCapacity;
    }
}
