package Assignment1;

import java.util.Scanner;

//Swapping program
public class Program5 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Before swapping");
        System.out.print("num1= "+num1+" num2= "+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        /*a=a+b;
        b=a-b;
        a=a-b;
        * */
        System.out.println("\nAfter swapping");
        System.out.print("num1= "+num1+" num2= "+num2);
    }
}
