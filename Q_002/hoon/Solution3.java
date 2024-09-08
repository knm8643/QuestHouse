import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * [BOJ] no.10845
 * https://www.acmicpc.net/problem/10845
 */

public class Solution3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();

        // 첫번째 줄
        int commandCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < commandCount; i++) {
            String commandLine = br.readLine();
            String command = commandLine.split(" ")[0];

            switch (command) {
                case("push"): {
                    int currentValue = Integer.parseInt(commandLine.split(" ")[1]);
                    queue.add(currentValue);
                    break;
                }
                case("pop"): {
                    if (queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.poll());
                    }
                    break;
                }
                case("size"): {
                    System.out.println(queue.size());
                    break;
                }
                case("empty"): {
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                }
                case("front"): {
                    if (queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.getFirst());
                    }
                    break;
                }
                case("back"): {
                    if (queue.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.getLast());
                    }
                    break;
                }
            }
        }
    }
}
