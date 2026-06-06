import java.util.*;

public class DP_MaxSum_col {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int[][] dp = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            dp[i][0] = arr[i][0];
        }
        for (int j = 1; j < c; j++) {
            int[] maxInfo = getfsMax(dp, j - 1, r);
            int firstMax = maxInfo[0];
            int secondMax = maxInfo[1];
            int firstMaxRow = maxInfo[2];
            for (int i = 0; i < r; i++) {
                if (i == firstMaxRow) {
                    dp[i][j] = arr[i][j] + secondMax;
                } else {
                    dp[i][j] = arr[i][j] + firstMax;
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++) {
            ans = Math.max(ans, dp[i][c - 1]);
        }
        System.out.println(ans);
    }

    private static int[] getfsMax(int[][] dp, int col, int r) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMaxRow = -1;
        for (int i = 0; i < r; i++) {
            if (dp[i][col] > firstMax) {
                secondMax = firstMax;
                firstMax = dp[i][col];
                firstMaxRow = i;
            } else if (dp[i][col] > secondMax) {
                secondMax = dp[i][col];
            }
        }

        return new int[] { firstMax, secondMax, firstMaxRow };
    }
}
