import java.util.Scanner;

public class _3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capasityElevator = Integer.parseInt(scanner.nextLine());

        double sum = Math.ceil(numberOfPeople * 1.00 / capasityElevator);
        System.out.printf("%.0f",sum);
    }
}
