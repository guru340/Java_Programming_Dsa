package recursions.array;

import java.util.Arrays;

public class mergeinplace {
    public static void main(String[] args) {
    int []arr={5,4,3,2,1};
    mergeINplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeINplace(int []arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid= (s+e)/2;

        mergeINplace(arr,s,mid);
        mergeINplace(arr,mid,e);

         mergesortINplace(arr,s,mid,e);
    }

    static void mergesortINplace(int []arr,int s,int mid,int e){
        int []mix=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid  && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
//        It May Be posssible that array is not complete or for remaining elements
        while (i< mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j< e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }
}
