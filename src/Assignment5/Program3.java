package Assignment5;
 //Matrix Multiplication
//Write a program to implement matrix multiplication
public class Program3 {
    static void matrixMultiply(int [][]A, int [][]B){
        int row1=A.length;
        int col1=A[0].length;
        int row2=B.length;
        int col2=B[0].length;
        int [][]result=new int[row1][col2];
        if(col1!=row2){
            System.out.println("Not to Multiply");
        }else{
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        result[i][j]+=A[i][k]*B[k][j];
                    }
                }
            }
            printMatrix(result);
        }
    }

    static void printMatrix(int[][] result) {
        for(int i=0;i<result[0].length;i++){
            for(int j=0;j< result.length;j++){
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][]A={ {1,2,3}, {4,5,6}};
        int [][]B={ {1,2}, {3,4}, {5,6}};
        matrixMultiply(A,B);
    }
}
