package ExceptionHandling.custom;

public class Check {
    static void result(int age) throws InvalidAgeException{
        if(age<=18){
            throw new InvalidAgeException("Age is invalid");
        }else{
            System.out.println("Age is valid");
        }
    }
    public static void main(String[] args) {
        try{
            Check.result(17);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
