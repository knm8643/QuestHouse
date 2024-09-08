import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        LinkedList<Integer> stack = new LinkedList<>();

        int n = Integer.parseInt(reader.readLine());
        int current = 1;

        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(reader.readLine());

            while (current <= target) {
                stack.push(current++);
                result.append("+\n");
            }

            if (stack.peek() == target) {
                stack.pop();
                result.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.print(result.toString());
        } else {
            System.out.println("NO");
        }
    }
}
