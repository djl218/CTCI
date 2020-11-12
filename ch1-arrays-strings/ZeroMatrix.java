/*
  Write an algorithm such that if an element in an M x N matrix is 0,
  its entire row and column are set to 0.

  Example:
  [[0,1,2], [3,4,5], [6,7,8], [9,10,11]]
  will become
  [[0,0,0], [0,4,5], [0,7,8], [0,10,11]]
*/

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0,1,2}, {3,4,5}, {6,7,8}, {9,10,11}};
        System.out.print("\n");
        printMatrix(arr);
        int numOfRows = arr.length;
        int numOfColumns = arr[0].length;
        turnToZeros(arr, numOfRows, numOfColumns);
        System.out.print("\n" + "will become" + "\n");
        printMatrix(arr);
        System.out.println("\n");
    }

    public static int[][] turnToZeros(int[][] arr, int numOfRows, int numOfColumns) {
        if (numOfRows == 0 || arr == null) {
            return arr;
        }
        int[] zeroRows = new int[numOfRows];
        int[] zeroColumns = new int[numOfColumns];

        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                if (arr[i][j] == 0) {
                    zeroRows[i] = 1;
                    zeroColumns[j] = 1;
                }
            }
        }

        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumns; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }
    
    public static void printMatrix(int[][] matrix) {
        System.out.print("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[0].length -1) {
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
