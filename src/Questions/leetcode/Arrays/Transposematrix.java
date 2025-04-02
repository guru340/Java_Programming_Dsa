package Questions.leetcode.Arrays;

import java.util.Arrays;

public class Transposematrix {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(transpose(arr)));
    }
    public  static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col=matrix[0].length;
        int[][] arr = new int[col][row];
        for (int i = 0; i <row;i++ ) {
            for(int j=0;j<col;j++){
                arr[j][i]=matrix[i][j];
            }
        }


        return arr;
    }
}
