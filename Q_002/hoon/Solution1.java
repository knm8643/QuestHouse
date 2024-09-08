import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * [BOJ] no.10828
 * https://www.acmicpc.net/problem/10828
 */

public class Solution1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        // 첫번째 줄
        int commandCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < commandCount; i++) {
            String commandLine = br.readLine();
            String command = commandLine.split(" ")[0];


            switch (command) {
                case("push"): {
                    int pushValue = Integer.parseInt(commandLine.split(" ")[1]);
                    stack.push(pushValue);
                    break;
                }
                case("pop"): {
                    if (stack.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                }
                case("size"): {
                    System.out.println(stack.size());
                    break;
                }
                case("empty"): {
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                }
                case("top"): {
                    if (stack.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
                }
            }
        }
    }
}
