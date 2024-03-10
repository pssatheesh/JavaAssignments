package Assignment2;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hour");
        int hour = sc.nextInt();
        System.out.println("Enter the minute of till time");
        int min = sc.nextInt();
        int minutes=hour*60;
        int seconds=(minutes+min)*60;
        System.out.println("You have finished "+seconds+" seconds");
    }
}
