package Questions.gfg.sorting;

import java.util.Arrays;

//sort 0s,1s,2s
public class sort0s1s2s {
    public static void main(String[] args) {
        int []arr={0,1,2,0,1,2};
        sort(arr);

    }

    static void sort(int []arr){
//        for (int i=0;i< arr.length;i++){
//            for(int j=0;j< arr.length-1;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j+1];
//                    arr[j+1]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }


        int max = Arrays.stream(arr).max().getAsInt();


        int[] count = new int[max + 1];


        for (int num : arr) {
            count[num]++;
        }


        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
