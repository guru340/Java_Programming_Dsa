package Segementqueries.codeforces;

import java.util.*;

public class LazyPropagation {
    static long[] seg;
    static long[] lazy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        seg = new long[4 * n];
        lazy = new long[4 * n];

        while (q-- > 0) {
            int type = sc.nextInt();

            if (type == 1) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long val = sc.nextLong();

                update(0, n - 1, 0, l, r - 1, val);
            } else {
                int l = sc.nextInt();
                int r = sc.nextInt();

                long ans = query(0, n - 1, l, r - 1, 0);
                System.out.println(ans);
            }
        }
    }

    public static void push(int start, int end, int idx) {
        if (lazy[idx] != 0) {


            seg[idx] += (end - start + 1) * lazy[idx];

            if (start != end) {
                lazy[2 * idx + 1] += lazy[idx];
                lazy[2 * idx + 2] += lazy[idx];
            }

            lazy[idx] = 0;
        }
    }

    public static void update(int start, int end, int idx, int l, int r, long val) {
        push(start, end, idx);

        if (start > r || end < l) return;

        if (l <= start && end <= r) {
            lazy[idx] += val;
            push(start, end, idx);
            return;
        }

        int mid = (start + end) / 2;

        update(start, mid, 2 * idx + 1, l, r, val);
        update(mid + 1, end, 2 * idx + 2, l, r, val);

        seg[idx] = seg[2 * idx + 1] + seg[2 * idx + 2];
    }

    public static long query(int start, int end, int l, int r, int idx) {
        push(start, end, idx);


        if (start > r || end < l) return 0;

        if (l <= start && end <= r) {
            return seg[idx];
        }

        int mid = (start + end) / 2;

        long left = query(start, mid, l, r, 2 * idx + 1);
        long right = query(mid + 1, end, l, r, 2 * idx + 2);

        return left + right;
    }
}