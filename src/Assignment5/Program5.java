package Assignment5;

import java.util.Arrays;
import java.util.Scanner;
/*. Initialize a jagged array with N rows with weights of N persons. Each person can have different number of weights. Write
      (i) A function to enter the weight of any user at any time.
      (ii) A function to calculate the minimum weight of the nth person.*/
public class Program5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of subarray:");
        int numberOfArrays= scanner.nextInt();
        int [][]jaggedArray=new int[numberOfArrays][];
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.print("Enter the size of sub-array " + (i + 1) + ": ");
            int sizeOfSubArray = scanner.nextInt();
            jaggedArray[i] = new int[sizeOfSubArray];
            for (int j = 0; j < sizeOfSubArray; j++) {
                System.out.print("Enter the element at index " + j + " of sub-array " + (i + 1) + ": ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The jagged array is:");
        for (int i = 0; i < numberOfArrays; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the row number to find the minmum in that row");
        int choice=scanner.nextInt();
        Arrays.sort(jaggedArray[choice-1]) ;
        int min=jaggedArray[choice-1][0];
        System.out.println(min);
    }
}
