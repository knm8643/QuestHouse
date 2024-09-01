import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 커스텀 큐
        ChanQueue queue = new ChanQueue();

        // 명령 개수
        int commandCount = Integer.parseInt(br.readLine());

        // 명령 실행
        for (int i = 0; i < commandCount; i++) {
            String[] commandParts = br.readLine().split(" ");
            String action = commandParts[0];

            switch (action) {
                case "push" -> queue.push(commandParts[1]);
                case "pop" -> System.out.println(queue.pop());
                case "size" -> System.out.println(queue.size());
                case "empty" -> System.out.println(queue.empty() ? 1 : 0);
                case "front" -> System.out.println(queue.front());
                case "back" -> System.out.println(queue.back());
            }
        }
    }

    // 커스텀 큐
    static class ChanQueue {
        private final ArrayList<String> list = new ArrayList<>();

        void push(String value) { list.add(value); }

        String pop() { return list.isEmpty() ? "-1" : list.remove(0); }

        int size() { return list.size(); }

        boolean empty() { return list.isEmpty(); }

        String front() { return list.isEmpty() ? "-1" : list.get(0); }

        String back() { return list.isEmpty() ? "-1" : list.get(list.size() - 1); }
    }
}
