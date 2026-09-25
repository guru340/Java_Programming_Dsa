package HCLTECH;

import java.util.*;

public class subarraysum {
    public static List<Integer> targetsum(List<Integer> list){
        List<Integer> list1=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<list.size();i++){
            int num = list.get(i);

            int count = map.getOrDefault(num, 0);

            if (count < 2) {
                list1.add(num);
                map.put(num, count + 1);
            }
        }

        return list1;
    }

    static void main() {
        List<Integer> l=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            l.add(scanner.nextInt());
        }

        System.out.println(targetsum(l));
    }
}
