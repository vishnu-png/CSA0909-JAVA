public class MatrixMultiplication {

    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        if (matrixA[0].length != matrixB.length) {
            System.out.println("Matrix multiplication is not possible. The number of columns in Matrix A must equal the number of rows in Matrix B.");
            return;
        }

        int[][] result = multiplyMatrices(matrixA, matrixB);

        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int m = matrixA.length;    
        int n = matrixA[0].length; 
        int p = matrixB[0].length; 

        int[][] result = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }
}
