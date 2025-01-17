import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int num=in.nextInt();
    int[] arr=new int[num];
    // Input of array 
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Array ");
        // for (int i = 0; i < arr.length; i++) {
            
        //     System.out.println(arr[i]);
        // }

            // Second method for printing array

            // for(int num2:arr){ for every element in array.print the array
            //     System.out.println(num2+""); here num represent  element of array
            // }

            // Third method for printing array
            // System.out.println(Array.toString(arr)); 
    }
}    