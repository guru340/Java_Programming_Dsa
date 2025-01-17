package array;

public class movealltozeros {
    public static void main(String[] args) {
    int []arr={1,2,0,5,9,0,4,5};
    pushZerosToEnd(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }


    static void pushZerosToEnd(int[] arr) {
        int start=0;


        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[start];
                arr[start]=temp;

                start++;
            }


        }
    }
}

