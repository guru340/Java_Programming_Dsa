package Segementqueries;

import java.io.*;
import java.util.*;

public class RMQBS {

    static int[][] maxST, minST;
    static int[] log;

    static void build(int[] a, int[] b, int n) {
        int K = 20;
        maxST = new int[n][K];
        minST = new int[n][K];
        log = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            log[i] = log[i / 2] + 1;
        }

        for (int i = 0; i < n; i++) {
            maxST[i][0] = a[i];
            minST[i][0] = b[i];
        }

        for (int j = 1; j < K; j++) {
            for (int i = 0; i + (1 << j) <= n; i++) {
                maxST[i][j] = Math.max(maxST[i][j - 1],
                        maxST[i + (1 << (j - 1))][j - 1]);

                minST[i][j] = Math.min(minST[i][j - 1],
                        minST[i + (1 << (j - 1))][j - 1]);
            }
        }
    }

    static int getMax(int l, int r) {
        int j = log[r - l + 1];
        return Math.max(maxST[l][j], maxST[r - (1 << j) + 1][j]);
    }

    static int getMin(int l, int r) {
        int j = log[r - l + 1];
        return Math.min(minST[l][j], minST[r - (1 << j) + 1][j]);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) b[i] = Integer.parseInt(st.nextToken());

        build(a, b, n);

        long ans = 0;

        for (int l = 0; l < n; l++) {

            int low = l, high = n - 1;
            int left = -1, right = -1;

            // find first r
            while (low <= high) {
                int mid = (low + high) / 2;
                int diff = getMax(l, mid) - getMin(l, mid);

                if (diff >= 0) {
                    if (diff == 0) left = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            low = l;
            high = n - 1;

            // find last r
            while (low <= high) {
                int mid = (low + high) / 2;
                int diff = getMax(l, mid) - getMin(l, mid);

                if (diff <= 0) {
                    if (diff == 0) right = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            if (left != -1 && right != -1) {
                ans += (right - left + 1);
            }
        }

        System.out.println(ans);
    }
}