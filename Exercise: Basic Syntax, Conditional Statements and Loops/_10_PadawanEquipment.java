import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceSingleSaber = Double.parseDouble(scanner.nextLine());
        double priceSingleRobe = Double.parseDouble(scanner.nextLine());
        double priceSingleBelt = Double.parseDouble(scanner.nextLine());

        double totalPriceSaber = Math.ceil(students + 0.10 * students) * priceSingleSaber;
        double totalPriceRobe = students * priceSingleRobe;
        double totalBelt = (students - students / 6) * priceSingleBelt;

        double total = totalBelt + totalPriceRobe + totalPriceSaber;

        if (amountMoney >= total){
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",total - amountMoney);
        }
    }
}
//100
//42
//12.00
//4.0
//3.0
//Output
//George Lucas will need 737,00 leva more.