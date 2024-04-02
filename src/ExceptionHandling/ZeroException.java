package ExceptionHandling;

import java.util.Scanner;

public class ZeroException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Enter the first value ");
            int val1=scanner.nextInt();
            System.out.println("Enter the second value");
            int val2=scanner.nextInt();
            System.out.println(val1/val2);
        }catch(ArithmeticException e){
            System.out.println("Your didisor value is Zero please change the value");
        }
    }
}
