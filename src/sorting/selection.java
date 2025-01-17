package sorting;

import java.util.Arrays;
class selection{
    public static void main(String[] args) {
           int []arr={1,3,4,5,2};
           selectionsort(arr);
           System.out.println(Arrays.toString(arr));
       }
   
        static void selectionsort(int []arr){
           for(int i=0;i<arr.length;i++){
               int last=arr.length-i-1;
               int maxIndex=getmaxIndex(arr,0,last);
               swap(arr,maxIndex,last);
           }
       }
       static void swap(int []arr,int first,int second){
           int temp=arr[first];
           arr[first]=arr[second];
           arr[second]=temp;
       }
       static int getmaxIndex(int []arr,int start,int end){
           int max=start;
           for(int i=start;i<=end;i++){
               if(arr[i]>arr[max]){
                   max=i;
               }
           }
           return max;
       }
   }