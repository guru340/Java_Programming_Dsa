package backtracking;

import java.util.ArrayList;

public class nqueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nqueen(board, 0);

    }

   private static void nqueen(char[][] board, int row) {
        int n = board.length;
        if (row == n) {
            for (int i = 0; i <n; i++) {

                for (int j = 0; j <n; j++) {

                    System.out.println(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int j = 0; j < n; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1);
                board[row][j] = '.';
            }
        }
    }

   private static boolean issafe(char[][] board, int row, int col) {
        int n = board.length;
//        check row
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
//        check col
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
//        check northeast
        int i = row;
        int j = col;
        while (j < n && i >= 0) {
            if (board[i][j] == 'Q') return false;
            i--;
            j++;
        }
//        check southeast
        i = row;
        j = col;
        while (j < n && i < n) {
            if (board[i][j] == 'Q') return false;
            i++;
            j++;

        }
//        check southwest
        i = row;
        j = col;
        while (j >= 0 && i < n) {
            if (board[i][j] == 'Q') return false;
            i++;
            j--;

        }

//        check northwest
        i=row;
        j=col;
        while (j>=0&&i>=0){
            if(board[i][j]=='Q')return false;
            i--;
            j--;
        }
        return true;
    }
}