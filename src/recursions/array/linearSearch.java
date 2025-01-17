package recursions.array;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 25, 55, 25, 78};
        System.out.println(find(arr, 65, 0));
//        System.out.println(findindex(arr, 25, 0));
        ArrayList<Integer> ans=findallindex(arr,25,0,new ArrayList<>());
        System.out.println(ans);
        System.out.println(findallindex2(arr,25,0));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;

        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findindex(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;

        }
        if (arr[index] == target) {
            return index;
        } else {
            return findindex(arr, target, index + 1);
        }

    }

    static int findindexlast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;

        }
        if (arr[index] == target) {
            return index;
        } else {
            return findindexlast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer>list=new ArrayList<>();
    static  void findallindex(int[]arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findallindex(arr,target,index+1);
    }

    static  ArrayList<Integer> findallindex(int[]arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findallindex(arr,target,index+1,list);
    }


    static  ArrayList<Integer> findallindex2(int[]arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
//        this will contain the answer for that function call only
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcall=findallindex2(arr, target,index+1);
        list.addAll(ansfrombelowcall);
        return list;
    }
}