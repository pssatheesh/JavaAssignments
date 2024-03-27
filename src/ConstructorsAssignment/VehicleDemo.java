package ConstructorsAssignment;
class vehicle{
    String vehicleName;
    String vehicleType;
    int manufacturingYear;

    vehicle(String vehicleName, String vehicleType, int manufacturingYear){
        this.vehicleName= vehicleName;
        this.vehicleType= vehicleType;
        this.manufacturingYear=manufacturingYear;
    }


}
class twoWheeler extends vehicle{
    String engine="Two stoke";
    public twoWheeler(String vehicleName, String vehicleType, int manufacturingYear){
        super(vehicleName, vehicleType, manufacturingYear);
    }
    public void display(){
        System.out.println("Vehicle details are "+vehicleName+"\t"+vehicleType+"\t"+manufacturingYear+"\t"+engine);
    }


    @Override
    public String toString() {
        return "twoWheeler{" +
                "engine='" + engine + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                '}';
    }
}
class fourWheeler extends vehicle{
    String engine="Four stoke";
    public fourWheeler(String vehicleName, String vehicleType, int manufacturingYear){
        super(vehicleName, vehicleType, manufacturingYear);
    }
    public void display(){
        System.out.println("Vehicle details are "+vehicleName+"\t"+vehicleType+"\t"+manufacturingYear+"\t"+engine);
    }
}
class heavyLoad extends vehicle{
    int wheels=16;
    public heavyLoad(String vehicleName, String vehicleType, int manufacturingYear){
        super(vehicleName, vehicleType, manufacturingYear);
    }
    public void display(){
        System.out.println("Vehicle details are "+vehicleName+"\t"+vehicleType+"\t"+manufacturingYear+"\t"+wheels);
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        twoWheeler v=new twoWheeler("Hero Splender", "petrol", 2021);
        System.out.println(v);


    }
}
