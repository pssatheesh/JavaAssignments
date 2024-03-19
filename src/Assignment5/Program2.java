package Assignment5;

import java.util.Scanner;

//Transpose Matrix
public class Program2 {
    public static void main(String[] args) {
        int [][]matrix={ {1,2,3}, {4,5,6}, {7,8,9}};
        int [][]res=new int[3][3];
        for(int i=0;i<matrix[0].length;i++){
            for(int j=i+1;j< matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j< matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
