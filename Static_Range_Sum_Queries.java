import java.util.*;
import java.io.*;

public class Static_Range_Sum_Queries {
    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int n = sc.nextInt();
        int q = sc.nextInt();

        long[] prefix = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + sc.nextLong();
        }

        StringBuilder ans = new StringBuilder();

        while (q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ans.append(prefix[b] - prefix[a - 1]).append('\n');
        }

        System.out.print(ans);
    }

    static class FastReader {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() {
            if (ptr >= len) {
                try {
                    len = in.read(buffer);
                    ptr = 0;
                } catch (IOException e) {
                    return -1;
                }
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() {
            int c;
            while ((c = read()) <= ' ') {
                if (c == -1) return -1;
            }

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            long val = 0;
            while (c > ' ') {
                val = val * 10 + c - '0';
                c = read();
            }

            return val * sign;
        }

        int nextInt() {
            return (int) nextLong();
        }
    }
}
