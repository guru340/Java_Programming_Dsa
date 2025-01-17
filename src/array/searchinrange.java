package array;

public class searchinrange {
    public static void main(String[] args) {
        // System.out.println("Enter the size of array:");
        // Scanner input=new Scanner(System.in);
        // int a=input.nextInt();
        // System.out.println("Enter the element of array:");
        // int b=input.nextInt();
        // int [] arrs=new int[a];
        // int num=input.nextInt();
        int[] nums={1,15,21,16};
        int target=15;
        int ans=linearsearch(nums, target,0,3);
        System.out.println(ans);

    }

    static int linearsearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if (element==target) {
                return i;
            }
        }
        // this will execute when if none  of the return statement above executed
        // hence target will not found
        return -1;
    }
}
