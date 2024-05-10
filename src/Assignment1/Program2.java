package Assignment1;

import java.util.Scanner;
// Write a Java program that gets a number from the user and displays the name of the weekday. Use enum.
public class Program2 {
    enum weekdays {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thrusday,
        Friday,
        Saturday
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 to 7 to find the day in a week");
        int n = sc.nextInt();
        switch(n){
            case 1:
                weekdays day=weekdays.Sunday;
                System.out.println(day);
                break;
            case 2:
                weekdays day2=weekdays.Monday;
                System.out.println(day2);
                break;
            case 3:
                weekdays day3=weekdays.Tuesday;
                System.out.println(day3);
                break;
            case 4:
                weekdays day4=weekdays.Wednesday;
                System.out.println(day4);
                break;
            case 5:
                weekdays day5=weekdays.Thrusday;
                System.out.println(day5);
                break;
            case 6:
                weekdays day6=weekdays.Friday;
                System.out.println(day6);
                break;
            case 7:
                weekdays day7=weekdays.Saturday;
                System.out.println(day7);
                break;
            default:
                System.out.println("Enter Invalid day");
        }

    }
}
