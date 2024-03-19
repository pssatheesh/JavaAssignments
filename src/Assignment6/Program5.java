package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input");
        String input=scanner.nextLine();
        String result="";
        String []arr=input.split(" ");
        for(int i=0;i<arr.length;i++){
            String temp=arr[i].substring(1);
            char t=Character.toUpperCase(arr[i].charAt(0));
            arr[i]=t+temp;
        }
        for(int i=0;i<arr.length;i++){
            result+=arr[i]+" ";
        }
        System.out.println(result);
    }
}
