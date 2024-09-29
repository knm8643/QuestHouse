package Q_003.chung;

import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] levels = new int[N];

        for (int i = 0; i < N; i++) {
            levels[i] = sc.nextInt();
        }
        Arrays.sort(levels);

        // 이분 탐색 변수 설정
        int left = levels[0];
        int right = levels[0] + K;
        int result = left;

        // 이분 탐색
        while (left <= right) {
            int mid = (left + right) / 2;
            long totalRequired = 0;
            for (int i = 0; i < N; i++) {
                if (levels[i] < mid) {
                    totalRequired += (mid - levels[i]);
                }
            }
            if (totalRequired <= K) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}