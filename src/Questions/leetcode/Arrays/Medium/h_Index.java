package Questions.leetcode.Arrays.Medium;

import java.util.Arrays;

//274 :h-Index
public class h_Index {
    public static void main(String[] args) {
        int []arr={3,0,1,6,5};
        System.out.println(hIndex(arr));
    }
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;

        for (int i = 0; i < n; i++) {

            if (citations[i] >= n - i) {
                return n - i;
            }
        }

        return 0;
    }
}
