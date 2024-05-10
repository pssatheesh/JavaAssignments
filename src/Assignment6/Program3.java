package Assignment6;

import java.util.Scanner;
//Write a program to reverse the words in a sentence.
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input");
        String input=scanner.nextLine();
        String []word=input.split(" ");
        String result="", rem="";
        for(int i=0;i<word.length;i++){
            for(int j=word[i].length()-1;j>=0;j--){
                result+=word[i].charAt(j);
            }
            result+=" ";
        }
        System.out.println(result);
    }
}
