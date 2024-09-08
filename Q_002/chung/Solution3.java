import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String input = reader.readLine();

            if (input.startsWith("push")) {
                int x = Integer.parseInt(input.split(" ")[1]);
                queue.offer(x);
            } else if (input.equals("pop")) {
                if (queue.isEmpty()) {
                    result.append("-1\n");
                } else {
                    result.append(queue.poll()).append("\n");
                }
            } else if (input.equals("size")) {
                result.append(queue.size()).append("\n");
            } else if (input.equals("empty")) {
                result.append(queue.isEmpty() ? 1 : 0).append("\n");
            } else if (input.equals("front")) {
                if (queue.isEmpty()) {
                    result.append("-1\n");
                } else {
                    result.append(queue.peek()).append("\n");
                }
            } else if (input.equals("back")) {
                if (queue.isEmpty()) {
                    result.append("-1\n");
                } else {
                    result.append(((LinkedList<Integer>) queue).getLast()).append("\n");
                }
            }
        }
        System.out.print(result.toString());
    }
}