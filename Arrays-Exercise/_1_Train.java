import java.util.Scanner;

public class _1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.printf("%d\n",sum);
    }
}
