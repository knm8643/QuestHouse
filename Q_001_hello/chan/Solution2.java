import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(num1 + num2).append('\n')
          .append(num1 - num2).append('\n')
          .append(num1 * num2).append('\n')
          .append(num1 / num2).append('\n')
          .append(num1 % num2);

        System.out.println(sb);
    }
}
