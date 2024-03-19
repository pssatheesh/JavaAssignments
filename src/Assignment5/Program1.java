package Assignment5;

import java.util.Scanner;

public class Program1 {
    public static void main(String []s){
        int arr[]={1,2,3,4,5};
        int n=2;
        for(int i=0;i<n;i++){
            rotateArray(arr);
        }
        print(arr);
    }

    public static void rotateArray(int []arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    public static void print(int []arr){
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }
}
