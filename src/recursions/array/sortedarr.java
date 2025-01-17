package recursions.array;
//array is sorted or not sorted in recursion
public class sortedarr {
    public static void main(String[] args) {
    int []arr={1,2,3,5,6};
        System.out.println(soreted(arr,0));
    }

    static  boolean soreted (int []arr,int index){
//        base condition
        if (index==arr.length-1){
            return true;

        }
        return arr[index]<arr[index+1] && soreted(arr, index+1);
    }
}
