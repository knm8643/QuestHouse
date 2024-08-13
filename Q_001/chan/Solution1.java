import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int hundreds = num2 / 100 % 10 ;
        int tens     = num2 / 10  % 10 ;
        int ones     = num2       % 10 ;

        System.out.println(num1 * ones);        // (3)
        System.out.println(num1 * tens);        // (4)
        System.out.println(num1 * hundreds);    // (5)
        System.out.println(num1 * num2);        // (6)
    }
}
