package backtracking;

public class knighttour {
    public static void main(String[] args) {

    }


        public boolean helper(int[][]grid,int row,int col,int num){
            int n=grid.length;

            int i,j;

            // 2up 1right
            i=row-2;
            j=col+1;
            if(i>=0 && j<n && grid[i][j]==num+1)return helper(grid,i,j,num+1);
            // 2up 1 left
            i=row-2;
            j=col+1;
            if(i>=0 && j<n && grid[i][j]==num+1)return helper(grid,i,j,num+1);

            // 2down 1right
            i=row+2;
            j=col+1;
            if(i<n && j<n && grid[i][j]==num+1)return helper(grid,i,j,num+1);
            // 2down 1 left
            i=row+2;
            j=col-1;
            if(i<n && j>=0 && grid[i][j]==num+1)return helper(grid,i,j,num+1);

            // 2 right 1up
            i=row-1;
            j=col+2;
            if(i>=0 && j<n && grid[i][j]==num+1)return helper(grid,i,j,num+1);

            // 2 right 1down
            i=row+1;
            j=col+2;
            if(i<n && j<n && grid[i][j]==num+1)return helper(grid,i,j,num+1);

            // 2 left 1up
            i=row-1;
            j=col-2;
            if(i>=0 && j>=0 && grid[i][j]==num+1)return helper(grid,i,j,num+1);
            // 2 left 1down
            i=row+1;
            j=col-2;
            if(i<n && j>=0 && grid[i][j]==num+1){return helper(grid,i,j,num+1);
            }
            // if(helper(grid,i,j,num+1)){
            //     return true;
            // }

            if(grid[row][col]==n*n-1){
                return true;
            }else{
                return false;
            }

        }
        public boolean checkValidGrid(int[][] grid) {
            int n=grid.length;
            if(grid[0][0]!=0){
                return false;
            }

            return helper(grid,0,0,0);
        }
    }


