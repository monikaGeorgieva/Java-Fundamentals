import java.util.Scanner;

public class _4_SumOfChairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            String letter = scanner.nextLine();
            int character = letter.charAt(0);
            sum += character;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
