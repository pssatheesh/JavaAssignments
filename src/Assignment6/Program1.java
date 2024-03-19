package Assignment6;

import java.util.Scanner;

//Count the vowels of the String
public class Program1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input");
        String input=scanner.next();
        String str=input.toLowerCase();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
