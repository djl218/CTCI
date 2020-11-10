/*
    Given an image represented by an N x N matrix, where each pixel in the image
    is represented by an integer, write a method to rotate the image by 90 degrees.
    Can you do this in place?
*/

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int[][] result = rotateMatrix(matrix);
        System.out.print("\n");
        printMatrix(matrix);
        System.out.print("\n" + "rotated 90 degrees becomes" + "\n");
        printMatrix(result);
        System.out.println("\n");
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return new int[][]{{0,0}, {0,0}};
        }

        int[][] result = new int[matrix.length][matrix.length];

        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            for (int k = 0; k < matrix.length; k++) {
                result[k][j] = matrix[i][k]; 
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.print("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix.length -1) {
                    System.out.print(",");
                }
            }
            if (i < matrix.length -1) {
                System.out.print("], ");
            }
        }
        System.out.print("]]");
    }
}
