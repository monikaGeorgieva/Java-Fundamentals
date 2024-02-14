import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        checkNumber(number);
    }

    public static void checkNumber(int number) {
        if (number > 0){
            System.out.printf("The number %d is positive.",number);
        } else if (number == 0) {
            System.out.printf("The number %d is zero.",number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.",number);
        }
    }
}
