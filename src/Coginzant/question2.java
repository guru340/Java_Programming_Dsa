package Coginzant;
// Vaild Windows
public class question2 {
    static void main() {
        int []arr={2 ,5, 8, 7 ,4, 3};
        System.out.println(vaildwindow(arr));
    }

    public static int vaildwindow(int arr[]){
        if(arr.length<2){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 2; i++) {
           max=Math.max(max,(arr[i]+arr[i+1]));
        }

        if(max%2==0){
            return -1;
        }
        else return max;
    }
}
