package Q_003.chung;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] houses = new int[N];

        for (int i = 0; i < N; i++) {
            houses[i] = sc.nextInt();
        }

        Arrays.sort(houses);

        // 이분 탐색 변수 설정
        int left = 1;
        int right = houses[N - 1] - houses[0];
        int result = 0;

        // 이분 탐색 시작
        while (left <= right) {
            int mid = (left + right) / 2;
            if (thisIsSoHard(houses, C, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }

    public static boolean thisIsSoHard(int[] houses, int C, int distance) {
        int count = 1;
        int lastPosition = houses[0];
        for (int i = 1; i < houses.length; i++) {
            if (houses[i] - lastPosition >= distance) {
                count++;
                lastPosition = houses[i];
            }
            if (count >= C) {
                return true;
            }
        }
        return false;
    }
}