package Assignment3;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your score");
        int n = sc.nextInt();
        if(n>0 && n<=100){
            if(n<=35){
                System.out.println("Your Grade is E");
            }else if(n>35 && n<=50){
                System.out.println("Your Grade is D");
            }else if(n>50 && n<=65){
                System.out.println("Your Grade is C");
            }else if(n>65 && n<=75){
                System.out.println("Your Grade is B");
            }else if(n>75 && n<=85){
                System.out.println("Your Grade is A");
            }else if(n>85 && n<=95){
                System.out.println("Your Grade is A+");
            }else{
                System.out.println("Your Grade is O");
            }
        }

    }
}
