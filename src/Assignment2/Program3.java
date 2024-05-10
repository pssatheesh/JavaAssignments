package Assignment2;

import java.util.Scanner;
//Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        System.out.println("Bitwise OR result is");
        System.out.println(a|b);
        System.out.println("Bitwise AND result is");
        System.out.println(a&b);
        System.out.println("Bitwise Left Shift result is");
        System.out.println(a<<b);
        System.out.println("Bitwise Right Shift result is");
        System.out.println(a>>b);
    }
}
