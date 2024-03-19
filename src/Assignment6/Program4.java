package Assignment6;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the emailId");
        String input=scanner.next();
        if(input.indexOf('@')!=-1){
            if(input.indexOf('@')>2 && input.indexOf('@')+5<=input.indexOf(".com")){
                System.out.println("Email is Valid");
            }else{
                System.out.println("Email is Invalid");
            }
        }else{
            System.out.println("Email is Invalid");
        }

    }
}
