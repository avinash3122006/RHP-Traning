import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int t = sc.nextInt();
            list.add(new int[]{h, t});
        }
        list.sort((a, b) -> Integer.compare(b[0], a[0]));
        int[] harr = new int[n];
        int[] tarr = new int[n];

        harr[0] = list.get(0)[0];
        tarr[0] = list.get(0)[1];

        for (int i = 1; i < n; i++) {
            if (list.get(i)[1] > tarr[i - 1]) {
                tarr[i] = list.get(i)[1];
                harr[i] = list.get(i)[0];
            } else {
                tarr[i] = tarr[i - 1];
                harr[i] = harr[i - 1];
            }
        }

        int q = sc.nextInt();

        while (q-- > 0) {
            int t = sc.nextInt();
            int idx = upperBound(tarr, t);

            if (idx == n)
                System.out.println(-1);
            else
                System.out.println(harr[idx]);
        }

        sc.close();
    }

    private static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}