package Assignment5;

import java.util.Scanner;
// Write a program to generate the matrix with integers in spiral order. Get size N from the user and generate an NxN spiral matrix.
//Sprial order matrix printing
public class Program4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input");
        int n=scanner.nextInt();
        int [][]result=new int[n][n];
        int value=1;
        int minRows=0, maxRows=n-1;
        int minCols=0, maxCols=n-1;
        while(value<=n*n){
            for(int i=minCols;i<=maxCols;i++){
                result[minRows][i]=value;
                value++;
            }
            for(int i=minRows+1;i<=maxRows;i++){
                result[i][maxCols]=value;
                value++;
            }
            for(int i=maxCols-1;i>=minCols;i--){
                result[maxRows][i]=value;
                value++;
            }
            for(int i=maxRows-1;i>=minRows+1;i--){
                result[i][minCols]=value;
                value++;
            }
            minRows++;
            maxRows--;
            minCols++;
            maxCols--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
