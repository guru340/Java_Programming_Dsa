package HCLTECH;

import java.util.HashMap;

public class subarraysum {
    public static int targetsum(int[]arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int sum=0;
        for(int num:arr){
            sum+=num;
            if(map.containsKey(sum-target)){
                count+=map.get(sum-target);
            }

                map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        return count;
    }

    static void main() {
        int[]arr={1,2,3,-2,1};
        int target=3;
        System.out.println(targetsum(arr,target));
    }
}
