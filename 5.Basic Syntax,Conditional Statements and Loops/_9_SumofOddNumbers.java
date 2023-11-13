import java.util.Scanner;

public class _9_SumofOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int a = 1;
        for (int i = 1; i <= n ; i++) {
            System.out.println(a);
            sum += a;
            a += 2;
        }
        System.out.printf("Sum: %d",sum);
    }
}
//3
//OutPut
//1
//3
//5
//Sum: 9