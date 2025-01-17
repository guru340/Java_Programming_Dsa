package binarysearch;

import java.util.Arrays;

public class sortedmatrix {
    public static void main(String[] args) {
        int [][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        
        System.out.println(Arrays.toString(search(arr, 5)));
    }

    static int [] binarysearch(int[][] matrix,int row,int cstart,int cend,int target){
        while (cstart<=cend) {
            int mid=cstart+(cend-cstart)/2;
            if (matrix[row][mid]==target) {
                return new int[]{row,mid};
            }
            if (matrix[row][mid]<target) {
                cstart=mid+1;
            }else{
                cend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[]search(int [][]matrix,int target){
        int r=matrix.length;
        int c=matrix[0].length;
      
        if (r==1) {
            return binarysearch(matrix, 0, 0, 0, target);
        }
        int rstart=0;
        int rend=r-1;
        int cmid=c/2;
        // run  the loop till 2 rows remaining
        while (rstart<(rend-1)) {//while this is true it will have more than 
            int mid=rstart+(rend-rstart);
            if (matrix[mid][cmid]==target) {
                return new int[]{mid,cmid};

            }

            if (matrix[mid][cmid]<target) {
                rstart=mid;
            }else{
                rend=mid;
            }
        }
        if(matrix[rstart][cmid]==target){
            return new int []{rstart,cmid};
        }
        if(matrix[rstart+1][cmid]==target){
            return new int []{rstart+1,cmid};
        }

        // search in first half
        if (target<=matrix[rstart][cmid-1]) {
            return binarysearch(matrix, r  , 0, cmid-1, target);
        }
        // search in second half
        if (target>=matrix[rstart][cmid-1] && target<=matrix[rstart][c-1]) {
            return binarysearch(matrix, r, cmid+1, c-1, target);
        }
        // search in third half
        if (target<=matrix[rstart+1][cmid-1]) {
            return binarysearch(matrix, rstart+1, 0, cmid-1, target);
        }
        // search in fourth half
        else{
            return binarysearch(matrix, rstart+1, cmid+1, c-1, target);
        }

    }


}

    
