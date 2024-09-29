package Q_003.chung;

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] trees = new int[N];

        for (int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
        }

        // 이분 탐색 변수 설정
        int left = 0;
        int right = Arrays.stream(trees).max().getAsInt();
        int result = 0;

        // 이분 탐색 시작
        while (left <= right) {
            int mid = (left + right) / 2;
            long total = 0;
            for (int tree : trees) {
                if (tree > mid) {
                    total += tree - mid;
                }
            }
            if (total >= M) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}