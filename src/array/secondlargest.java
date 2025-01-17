package array;

public class secondlargest {
    public static void main(String[] args) {
        int []arr={1,5,6,7,8};
        System.out.println(SecondLargest(arr));
    }

    static int SecondLargest(int[] arr) {
        int max=0;
        int secondmax=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]) {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=arr[i];
                }

        }


        }

        return temp;
    }
}
