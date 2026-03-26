package Segementqueries;

import java.util.Arrays;
import java.util.Scanner;

public class prefixsum {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int prefix[]=new int[n];
        int suffix[]=new int[n];

        prefix[0]=arr[0];
        suffix[n-1]=arr[n-1];
        for (int i = 1; i <n ; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int j=n-2;j>=0;j--){
            suffix[j]=suffix[j+1]+arr[j];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
    }
}

