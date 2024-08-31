import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/**
 * [BOJ] no.1874
 * https://www.acmicpc.net/problem/1874
 */

public class Solution2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int inputLineSize = Integer.parseInt(br.readLine());
        ArrayList<Integer> sequence = new ArrayList<>();

        for (int i = 0; i < inputLineSize; i++) {
            sequence.add(Integer.valueOf(br.readLine()));
        }

        Stack<Integer> stack = new Stack<>();
        int currentNum = 1;

        for (int i = 0; i < inputLineSize; i++) {
            int currentInputNum = sequence.get(i);

            while (currentNum <= currentInputNum) {
                stack.push(currentNum++);
                result.append("+\n");
            }

            if (!stack.isEmpty() && stack.peek() == currentInputNum) {
                stack.pop();
                result.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(result);
    }
}
