import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Solution2 {

    public static void main(String[] args) throws IOException {

        // 수열의 길이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sequenceLength = Integer.parseInt(br.readLine());

        // 스택
        Stack<Integer> stack = new Stack<>();

        // 결과
        ArrayList<String> resultList = new ArrayList<>();

        // 사용자 입력 값
        int inputListIndex = 0;
        ArrayList<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < sequenceLength; i++) inputList.add(Integer.parseInt(br.readLine()));

        // 수열을 만들 수 있는지
        for (int i = 1; i <= sequenceLength; i++) {
            // 1부터 차례로 push
            stack.push(i);
            resultList.add("+");

            // 입력값과 동일한 경우 pop
            while (!stack.empty() && stack.peek() == inputList.get(inputListIndex)) {
                stack.pop();
                resultList.add("-");
                inputListIndex++;

            }

        }

        if (stack.empty()) {
            // 스택을 다 비웠으면 성공
            for (String result : resultList) System.out.println(result);

        } else {
            // 스택을 다 비우지 못했으면 실패
            System.out.println("NO");

        }
    }

}
