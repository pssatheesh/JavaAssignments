package Assignment6;

import java.util.Scanner;
//Create a program to count vowels in a given string using string functions
//Count the vowels of the String
public class Program1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input");
        String input=scanner.next();
        String str=input.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'|| str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
