import java.util.Scanner;

public class Mtrix {
    private static void printResultArray(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat.length; col++) {
                System.out.print(mat[row][col] + "  ");
            }
            System.out.println();
        }
    }

    private static void sum(int[][] mat1, int[][] mat2, int row, int column) {
        int[][] sum = new int[row][column];
        for (int r = 0; r < mat1.length; r++) {
            for (int c = 0; c < mat1[r].length; c++) {
                sum[r][c] = mat1[r][c] + mat2[r][c];
            }
        }
        printResultArray(sum);
    }

    public static void main(String[] args) {
        System.out.println("Please enter the rows in the matrix");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Please enter the columns in the matrix");
        int column = sc.nextInt();
        int[][] mat1 = new int[row][column];
        int[][] mat2 = new int[row][column];
        int[][] sum = new int[row][column];
        System.out.println("enter elements or first matrix");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter [" + r + "][" + c + "] integer"));
                mat1[r][c] = sc.nextInt();
            }
        }
        System.out.println("enter elements or secound matrix");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter [" + r + "][" + c + "] integer"));
                mat2[r][c] = sc.nextInt();
            }
        }

        Mtrix m = new Mtrix();
        m.printResultArray(mat1);
        m.printResultArray(mat2);
        m.sum(mat1, mat2, row, column);
    }
}