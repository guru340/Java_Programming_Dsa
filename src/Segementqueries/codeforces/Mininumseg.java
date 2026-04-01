package Segementqueries.codeforces;
//minimum plus count the segment of the code
import java.util.*;

public class Mininumseg {
    static int segMin[];
    static int segCount[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        segMin = new int[4 * n];
        segCount = new int[4 * n];

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        build(arr, 0, n - 1, 0);

        while (q-- > 0) {
            int type = sc.nextInt();

            if (type == 1) {
                int i = sc.nextInt();
                int v = sc.nextInt();
                update(0, n - 1, 0, i, v);
            } else {
                int l = sc.nextInt();
                int r = sc.nextInt();

                int[] res = query(l, r - 1, 0, n - 1, 0);
                System.out.println(res[0] + " " + res[1]);
            }
        }
    }

    // BUILD
    private static void build(int[] arr, int l, int r, int idx) {
        if (l == r) {
            segMin[idx] = arr[l];
            segCount[idx] = 1;
            return;
        }

        int mid = (l + r) / 2;

        build(arr, l, mid, 2 * idx + 1);
        build(arr, mid + 1, r, 2 * idx + 2);

        merge(idx);
    }

    // MERGE LOGIC
    private static void merge(int idx) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if (segMin[left] < segMin[right]) {
            segMin[idx] = segMin[left];
            segCount[idx] = segCount[left];
        } else if (segMin[right] < segMin[left]) {
            segMin[idx] = segMin[right];
            segCount[idx] = segCount[right];
        } else {
            segMin[idx] = segMin[left];
            segCount[idx] = segCount[left] + segCount[right];
        }
    }

    // QUERY
    private static int[] query(int l, int r, int start, int end, int idx) {
        // no overlap
        if (r < start || end < l) {
            return new int[]{Integer.MAX_VALUE, 0};
        }

        // complete overlap
        if (l <= start && end <= r) {
            return new int[]{segMin[idx], segCount[idx]};
        }

        int mid = (start + end) / 2;

        int[] left = query(l, r, start, mid, 2 * idx + 1);
        int[] right = query(l, r, mid + 1, end, 2 * idx + 2);

        // merge result
        if (left[0] < right[0]) return left;
        if (right[0] < left[0]) return right;

        return new int[]{left[0], left[1] + right[1]};
    }

    // UPDATE
    private static void update(int start, int end, int idx, int pos, int val) {
        if (start == end) {
            segMin[idx] = val;
            segCount[idx] = 1;
            return;
        }

        int mid = (start + end) / 2;

        if (pos <= mid) {
            update(start, mid, 2 * idx + 1, pos, val);
        } else {
            update(mid + 1, end, 2 * idx + 2, pos, val);
        }

        merge(idx);
    }
}