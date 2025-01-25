package Questions.leetcode.Arrays;
//1572:Matrix Diagonal Sum
public class Diagonalsum {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(arr));
    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += mat[i][i];


            if (i != n - i - 1) {
                sum += mat[i][n - i - 1];
            }
        }

        return sum;

    }
}
