import java.math.BigDecimal;
import java.util.Scanner;

public class _3_ExactSumofRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal result = new BigDecimal("0");
        for (int i = 0; i < n ; i++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            result = result.add(number);
        }
        System.out.println(result);
    }
}
//3
//1000000000000000000
//5
//10
//output
//1000000000000000015

