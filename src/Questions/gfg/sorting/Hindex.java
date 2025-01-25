package Questions.gfg.sorting;

import java.util.Arrays;

//H-index
public class Hindex {
    public static void main(String[] args) {

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
