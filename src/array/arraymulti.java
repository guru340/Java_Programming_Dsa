package array;

import java.util.Scanner;;
public class arraymulti {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in); 
        int [][] arr=new int[3][3];
        // Input
        for (int row  = 0; row < arr.length; row++) {
            for (int i = 0; i < arr[row].length; i++) {
                arr[row][i]=in.nextInt();
            }
        }

        // for (int row  = 0; row < arr.length; row++) {
        //     for (int i = 0; i < arr[row].length; i++) {
        //         System.out.println(arr[row][i]+" ");
        //     }
        //     System.out.println();
        // }
        
            
}
}