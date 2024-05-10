package Assignment6;

import java.util.Scanner;
//Write a program to reverse the characters of a string.
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input");
        String input=scanner.next();
        String res="";
        for(int i=input.length()-1;i>=0;i--){
            res+=input.charAt(i);
        }
        System.out.println(res);
    }
}
