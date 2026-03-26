package Segementqueries;

import java.io.*;
import java.util.*;

public class sparseTable {

    static final int MAX_N = 100000 + 14;
    static final int LG = 17;

    static int n, q;
    static int[][] seg = new int[MAX_N][LG];
    static int[] arr = new int[MAX_N];

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            seg[i][0] = arr[i];
        }

        // Build Sparse Table
        for (int k = 1; k < LG; k++) {
            for (int i = 0; i + (1 << k) <= n; i++) {
                seg[i][k] = Math.min(
                        seg[i][k - 1],
                        seg[i + (1 << (k - 1))][k - 1]
                );
            }
        }

        q = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();

        while (q-- > 0) {

            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            r++; // make it exclusive
            int len = r - l;

            int k = 0;
            while ((1 << (k + 1)) <= len) {
                k++;
            }

            int ans = Math.min(
                    seg[l][k],
                    seg[r - (1 << k)][k]
            );

            output.append(ans).append('\n');
        }

        System.out.print(output);
    }
}