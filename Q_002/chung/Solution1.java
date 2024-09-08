import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> stack = new LinkedList<>();

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (input.startsWith("push")) {
                String[] parts = input.split(" ");
                int x = Integer.parseInt(parts[1]);
                stack.push(x);
            } else if (input.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if (input.equals("size")) {
                System.out.println(stack.size());
            } else if (input.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            } else if (input.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
        scanner.close();
    }
}
