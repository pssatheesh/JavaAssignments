package Exercism;

public class ElonToyCar {
    public ElonToyCar elonsToyCar;
    private int drivenDistance;
    private int batteryUsage;
    public static ElonToyCar buy() {
        ElonToyCar elonsToyCar = new ElonToyCar();
        elonsToyCar.batteryUsage = 100;
        elonsToyCar.drivenDistance = 0;
        return elonsToyCar;
    }

    public String distanceDisplay() {
        if(elonsToyCar == null){
            elonsToyCar = ElonToyCar.buy();
        }
        return "Driven "+elonsToyCar.drivenDistance+" meters";
    }

    public String batteryDisplay() {
        if(elonsToyCar == null){
            elonsToyCar = ElonToyCar.buy();
        }
        if(elonsToyCar.batteryUsage>0)
            return "Battery at "+elonsToyCar.batteryUsage+"%";
        else
            return "Battery empty";
    }

    public void drive() {
        if(elonsToyCar == null){
            elonsToyCar = ElonToyCar.buy();
        }
        if(elonsToyCar.batteryUsage>0){
            elonsToyCar.drivenDistance+=20;
            elonsToyCar.batteryUsage--;
        }
    }
}
