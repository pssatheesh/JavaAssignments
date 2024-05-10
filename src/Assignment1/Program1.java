package Assignment1;

import java.util.Scanner;
//Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short
public class Program1 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int a=sc.nextInt();
        System.out.println("Convert int to short");
        System.out.println((short)a);
        System.out.println("Convert int to float");
        float f=(float)a;
        System.out.println(f);
        System.out.println("Convert float to double");
        double d=(double)f;
        System.out.println(d);
        System.out.println("Convert double to float");
        float s=(float)f;
        System.out.println(s);
    }
}
