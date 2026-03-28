import java.util.*;
import java.io.*;

public class Main {
    static final long MOD = 676767677L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            if (x == 0 && y == 0) {

                sb.append("1\n\n");
                continue;
            }

            if (x == 0) {

                long divCount = countDivisors(y) % MOD;
                sb.append(divCount).append('\n');

                for (long i = 0; i < y; i++) sb.append("-1 ");
                sb.append('\n');

            } else if (y == 0) {


                long divCount = countDivisors(x) % MOD;
                sb.append(divCount).append('\n');

                for (long i = 0; i < x; i++) sb.append("1 ");
                sb.append('\n');

            } else {

                sb.append(1).append('\n');
                long S = x - y;
                if (S >= 0) {

                    for (long i = 0; i < x; i++) sb.append("1 ");
                    for (long i = 0; i < y; i++) sb.append("-1 ");
                } else {

                    for (long i = 0; i < y; i++) sb.append("-1 ");
                    for (long i = 0; i < x; i++) sb.append("1 ");
                }
                sb.append('\n');
            }
        }

        System.out.print(sb);
    }

    static long countDivisors(long n) {
        long count = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) count++;
            }
        }
        return count;
    }
}
