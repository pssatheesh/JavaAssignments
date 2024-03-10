package Assignment1;

import java.util.Scanner;
    //Random number
public class Program3 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range of number");
        int range=sc.nextInt();
        int res=(int)(Math.random()*range);
        System.out.println(res);
    }
}
