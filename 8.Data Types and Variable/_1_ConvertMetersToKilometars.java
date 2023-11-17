import java.util.Scanner;

public class _1_ConvertMetersToKilometars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters = Integer.parseInt(scanner.nextLine());
        double km = meters / 1000.0;
        System.out.printf("%.2f",km);
    }
}
//798
//output
//0.80
