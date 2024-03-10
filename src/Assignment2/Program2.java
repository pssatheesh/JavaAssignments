package Assignment2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x2");
        int a = sc.nextInt();
        System.out.println("Enter the value of x");
        int b = sc.nextInt();
        System.out.println("Enter the constant value");
        int c = sc.nextInt();
        int temp=(b*b)-(4*a*c);
        double root=Math.sqrt(temp);

        if(temp>0){
            double possible1=((-b)+root)/(2*a);
            double possible2=((-b)-root)/(2*a);
            System.out.println("First possible is "+possible1);
            System.out.println("second possible is "+possible2);
        }else{
            System.out.println("Imaginery parts are present");
        }
    }
}
