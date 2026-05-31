package array;

public class mulDimArray {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int matrix [][] = { 
                            {1, 2, 3}, 
                            {4, 5, 6}, 
                            {7, 8, 9}
                        }; 
        // int twoArray [][] = new int[2][2];
        // twoArray[0][1] = 5;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
