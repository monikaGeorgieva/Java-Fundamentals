import java.util.Scanner;

public class _9_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        double dayPrice = 0;
        for (int i = 1; i <= orders;i++){
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());

            dayPrice = (days * countCapsules) * pricePerCapsule;
            totalPrice += dayPrice;
            System.out.printf("The price for the coffee is: $%.2f\n",dayPrice);
        }
        System.out.printf("Total: $%.2f\n",totalPrice);
    }
}
//2
//4.99
//31
//3
//Output
//The price for the coffee is: $464,07
//0.35
//31
//5
//The price for the coffee is: $54,25
//Total: $518,32