package Assignment3;

import java.util.Scanner;
//Write a Java program to find the number of days in a given month and year.
public class Program2 {
    public static int numberOfDays(int year, int mon){
        int days=0;
        if(mon==2){
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                return 29;
            }else{
                return 28;
            }
        }
        switch(mon){
            case 1: case 3: case 5: case 7: case 8: case 10:
            case 12:
                days=31;
                break;
             case 4: case 6: case 9: case 11:
                days=30;
                break;
        }

        return days;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        int mon = sc.nextInt();
        System.out.println("Enter the year");
        int year=sc.nextInt();
        System.out.println(numberOfDays(year, mon));
    }
}
