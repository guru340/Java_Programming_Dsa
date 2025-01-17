package array;

public class missingarray {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(missing(arr));
    }

    static int missing(int[] arr) {
        int sum = 0;
        for (int i = 0; i <arr.length-1; i++) {
            sum = sum + arr[i];

        }
        int actual = (arr.length*(arr.length + 1))/2;
        int missing = actual-sum;

        return missing;
    }
//    public int cycle(int []arr){
//        int i=0;
//        while(i<arr.length){
//            int correct=arr[i]-1;
//            if(arr[i]<arr.length && arr[i]!=arr[correct]){
//                swap(arr,i,correct);
//            }
//            else{
//                i++;
//
//            }
//
//        }
//    }
//    static void swap(int []arr,int first,int second){
//        int temp=arr[first];
//        arr[first]=arr[second];
//        arr[second]=temp;
//
//    }
}
