package ExceptionHandling;

import java.util.Scanner;

//Write program to demonstrate ArrayIndexOutOfBoundsException


public class ArrayIndex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            int []arr={1,2,3,4,5,6};
            for(int i=0;i<=arr.length;i++){
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your Array index is out of bound");
        }
    }
}
