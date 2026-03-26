package Segementqueries;

import java.util.Arrays;

public class segmentree {
    static int segemt[];
    static void main() {
    int arr[]={2,1,3,7};
        int n=arr.length;
       segemt=new int[2*n];

        segemet(arr,0,0,n-1);
        System.out.println(Arrays.toString(segemt));
    }
    public static void segemet(int arr[],int idx,int l,int r){
        int n= arr.length;

        if(l==r){
            segemt[idx]=arr[l];
            return ;
        }
        int mid=(l+r)/2;
        segemet(arr,2*idx+1,l,mid);
        segemet(arr,2*idx+2,mid+1,r);
        segemt[idx]=segemt[2*idx+1]+segemt[2*idx+2];

    }
}
