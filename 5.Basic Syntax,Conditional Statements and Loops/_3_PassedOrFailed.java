import java.util.Scanner;

public class _3_PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
      if (number < 3.00){
          System.out.println("Failed!");
      } else if (number > 2.99) {
          System.out.println("Passed!");
      }
    }
}
