package Assignment5;

public class Program3 {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][]B= { {2,3,4}, {5,6,7}, {8,9,1}};
        int[][] res = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                res[i][j]=A[i][j]*B[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
