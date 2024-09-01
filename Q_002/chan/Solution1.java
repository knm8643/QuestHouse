import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 커스텀 스택
        ChanStack stack = new ChanStack();

        // 명령 개수
        int commandCount = Integer.parseInt(br.readLine());

        // 명령 실행
        for (int i = 0; i < commandCount; i++) {
            String[] commandParts = br.readLine().split(" ");
            String action = commandParts[0];

            switch (action) {
                case "push" -> stack.push(commandParts[1]);
                case "pop" -> System.out.println(stack.pop());
                case "size" -> System.out.println(stack.size());
                case "empty" -> System.out.println(stack.isEmpty() ? 1 : 0);
                case "top" -> System.out.println(stack.top());
            }
        }
    }

    // 커스텀 스택
    static class ChanStack {
        private final ArrayList<String> list = new ArrayList<>();

        void push(String value) { list.add(value); }

        String pop() { return list.isEmpty() ? "-1" : list.remove(list.size() - 1); }

        int size() { return list.size(); }

        boolean isEmpty() { return list.isEmpty(); }

        String top() { return list.isEmpty() ? "-1" : list.get(list.size() - 1); }
    }
}
