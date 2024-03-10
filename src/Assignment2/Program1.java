package Assignment2;

import java.util.Scanner;
    //convert Celsius to Fahrenheit
public class Program1 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the celsius value");
        float temp=sc.nextFloat();
        float res=(temp*1.8f)+32;
        System.out.println("Your farenheit value is "+res);
    }
}
