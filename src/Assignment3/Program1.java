package Assignment3;

import java.util.Scanner;
//Greatest of three
//Take three numbers from the user and print the greatest number.
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = sc.nextInt();
        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        System.out.println("Enter the Third number");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("The Largest Number is "+a);
            }else{
             System.out.println("The Largest Number is "+c);
            }
        }else{
            System.out.println("The Largest Number is "+b);
        }
    }
}
