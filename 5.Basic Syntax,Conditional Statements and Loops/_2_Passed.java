import java.util.Scanner;

public class _2_Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        if (number >= 3.00){
            System.out.print("Passed!");
        }
    }
}
