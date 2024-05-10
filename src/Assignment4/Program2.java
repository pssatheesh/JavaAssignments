package Assignment4;

import java.util.Scanner;
// Write a program to print prime numbers between 1 to 30
//Prime Number
public class Program2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start range:");
        int start=sc.nextInt();
        System.out.println("Enter the end range:");
        int end=sc.nextInt();
        System.out.println("Prime numbers from "+start+" to "+end);
        for(int i=start;i<end;i++){
            int factor=0;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    factor++;
                }
            }
            if(factor==0){
                System.out.println(i);
            }
        }
    }
}
