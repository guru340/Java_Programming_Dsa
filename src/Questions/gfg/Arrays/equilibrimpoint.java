package Questions.gfg.Arrays;
//question from gfg
public class equilibrimpoint {
    public static void main(String[] args) {
        int[] arr = {1, 2,0,3};
        System.out.println(findEquilibrium(arr));
    }

    public static int findEquilibrium(int arr[]) {
        if(arr.length==0){
            return -1;
        }

        int sumleft = 0;

        int totalsum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        int sumright = totalsum;
        for (int i = 0; i < arr.length - 1; i++) {
            sumright = sumright - arr[i];
            if (sumleft == sumright) {
                return i;
            }
            sumleft = sumleft + arr[i];

        }
        return -1;
    }
}









