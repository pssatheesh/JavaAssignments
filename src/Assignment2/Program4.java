package Assignment2;

import java.util.Scanner;
//Write a program to calculate a person's Body Mass Index on user input for weight and height. Get BMI formula from the internet.
//Body Mass Index
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person weight");
        float weight = sc.nextFloat();
        System.out.println("Enter the person height in cm");
        float height = sc.nextFloat();
        float m=height/100.0f;
        float bmi=weight/(m*m);
        if(bmi<18.5){
            System.out.println(bmi+" is Underweight");
        }else if(bmi>18.5 && bmi<24.9){
            System.out.println(bmi+" is Normal");
        }else if(bmi>25){
            System.out.println(bmi+" is overweight");
        }
    }
}
