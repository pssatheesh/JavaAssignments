package Assignment4;

import java.util.Scanner;
//Write a function to return index in which the given number occurs for the second time in an array, -1 if not present for the second time.
//Input:
//Array: [2,3,4,2,8,7]
//Number: 2
//
//Output: 3
//Explanation: '2' occurs in 3rd index for the second time
public class Program1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of inputs in array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter "+n+" inputs to array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target number:");
        int target=sc.nextInt();
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
        }
        System.out.println("Your number index is "+index);
    }
}
