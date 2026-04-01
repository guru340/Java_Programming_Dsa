import java.util.*;
import java.io.*;

import java.util.*;

public class Main {
    static int seg[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        seg = new int[4 * n];
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

                int ans = queries(l, r - 1, 0, n - 1, 0);
                System.out.println(ans);
            }
        }
    }

    private static void build(int[] arr, int l, int r, int idx) {
        if (l == r) {
            seg[idx] = arr[l];
            return;
        }

        int mid = (l + r) / 2;

        build(arr, l, mid, 2 * idx + 1);
        build(arr, mid + 1, r, 2 * idx + 2);

        seg[idx] = Math.min(seg[2 * idx + 1], seg[2 * idx + 2]);
    }

    private static int queries(int l, int r, int start, int end, int idx) {
        // no overlap
        if (r < start || end < l) {
            return Integer.MAX_VALUE;  // FIXED
        }

        // complete overlap
        if (l <= start && end <= r) {  // FIXED
            return seg[idx];
        }

        int mid = (start + end) / 2;

        int left = queries(l, r, start, mid, 2 * idx + 1);
        int right = queries(l, r, mid + 1, end, 2 * idx + 2);

        return Math.min(left, right);
    }

    private static void update(int start, int end, int idx, int pos, int val) {
        if (start == end) {
            seg[idx] = val;
            return;
        }

        int mid = (start + end) / 2;

        if (pos <= mid) {
            update(start, mid, 2 * idx + 1, pos, val);
        } else {
            update(mid + 1, end, 2 * idx + 2, pos, val);
        }

        seg[idx] = Math.min(seg[2 * idx + 1], seg[2 * idx + 2]);
    }
}
