import java.util.Scanner;
public class SolutionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int [3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                matrix2[i][j]=sc.nextInt();
            }
        }
        matrix1=transpose(matrix1);
        matrix2=transpose(matrix2);
        System.out.println();
        int[][] ans = multiplyMatrix(matrix1, matrix2);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
    static int[][] transpose(int[][] matrix){
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for(int j=0; j < matrix[0].length; j++){
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
    static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
            int[][] mat3 = new int[matrix1.length][matrix2[0].length];
            int i, j, k; 
            for (i = 0; i < matrix1.length; i++) 
            {
                for (j = 0; j < matrix2[0].length; j++) 
                {
                    for (k = 0; k < matrix2.length; k++)
                        mat3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
            return mat3;
    }
}
