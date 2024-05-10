package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// Create a program to get phone number from the user and throw InputMismatchException if the user enters non-number input

public class InputMismatch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Enter your Phone number: ");
            long number=scanner.nextLong();
        }catch(InputMismatchException e){
            System.out.println("Invalid phone number");
        }
    }
}
