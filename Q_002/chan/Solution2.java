import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Solution2 {

    public static void main(String[] args) throws IOException {

        // 입력받을 수열의 길이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 스택
        Stack<Integer> stack = new Stack<>();

        // 결과 (+, -)
        ArrayList<String> resultList = new ArrayList<>();

        // 마지막으로 push 된
        int maxPushed = 0;

        // 입력된 수열을 처리
        while (n-- > 0) {

            int currentNumber = Integer.parseInt(br.readLine());

            // 현재 스택에 푸시된 가장 큰 수보다 더 큰 수가 입력된 경우
            if (maxPushed < currentNumber) {
                for (int i = maxPushed + 1; i <= currentNumber; i++) {
                    stack.push(i);
                    resultList.add("+");
                }
                // 현재 입력된 수를 가장 큰 푸시된 수로 갱신
                maxPushed = currentNumber;
            }
            // 스택의 맨 위 값이 현재 입력된 수와 다르면, 수열을 만들 수 없음
            else if (stack.peek() != currentNumber) {
                System.out.println("NO");
                return;
            }

            // 스택의 맨 위 값을 팝하고, "-" 연산 기록
            stack.pop();
            resultList.add("-");
        }

        // 결과 출력
        for (String result : resultList) {
            System.out.println(result);
        }
    }

}
