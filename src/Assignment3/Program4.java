package Assignment3;

import java.util.Scanner;
//. Write a program to print multiplication table of a given number in a neat format
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i=1;i<=20;i++){
            System.out.println(i+" x "+n+" = "+(i*n));
        }

    }
}
