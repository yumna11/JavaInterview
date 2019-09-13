package ArraysAndStrings;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[1][0] = 2;
        matrix[1][1] = 3;
        System.out.println("Before changes");
        printMatrix(matrix);
        setZeros(matrix);
        System.out.println("After changes");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        //print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void setZeros(int[][] matrix) {
        int row = matrix.length;
        int cols = matrix[0].length;
        boolean[] rows = new boolean[row];
        boolean[] columns = new boolean[cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j]==0){
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        //nullify rows
        for (int i = 0; i < rows.length; i++) {
            if (rows[i]) nullifyRow(matrix, i);
        }

        //nullify columns
        for (int i = 0; i < columns.length; i++) {
            if (columns[i]) nullifyCol(matrix, i);
        }
    }

    private static void nullifyCol(int[][] matrix, int col) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[j][col] = 0;
        }
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }


}
