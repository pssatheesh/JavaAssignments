package Assignment4;

import java.util.Scanner;
//Write a program to find the sum of even numbers only in a given array. Use continue.
public class Program3 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " inputs to array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                continue;
            }else{
                sum+=arr[i];
            }
        }
        System.out.println("Sum of even number in given array is "+sum);
    }
}
