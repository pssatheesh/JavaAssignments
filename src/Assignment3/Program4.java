package Assignment3;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i=1;i<=20;i++){
            System.out.println(i+" x "+n+" = "+(i*n));
        }

    }
}
