import java.util.Scanner;

public class _7_VendingMashine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //дробно число или текста ("Start")
        double sumCoins = 0;

        while (!input.equals("Start")){
            double coin = Double.parseDouble(input);
            if (coin == 0.1 ||  coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){
                sumCoins += coin;
            }else {
                System.out.printf("Cannot accept %.2f\n",coin);
            }
            input = scanner.nextLine();
        }
        //каква е депозираната сума,която ще се използва за пазаруване ->sumCoins
            // втора част за копуване на продукт
        // налични продукти: "Nuts","Water","Crisps","Soda" ,"Coke"
        String product = scanner.nextLine();
        while (!product.equals("End")){
            //валиден продукт -> проверка на избран продукт
            switch (product){
                case "Nuts":
                    if (sumCoins >= 2){
                        //мога да си купя продукта
                        System.out.println("Purchased Nuts");
                        sumCoins -= 2;
                    }else {
                        //не мога да си купя продукта
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sumCoins >= 0.70){
                        System.out.println("Purchased Water");
                        sumCoins -= 0.70;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sumCoins >= 1.50){
                        System.out.println("Purchased Crisps");
                        sumCoins -= 1.50;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sumCoins >= 0.80){
                        System.out.println("Purchased Soda");
                        sumCoins -= 0.80;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sumCoins >= 1.00){
                        System.out.println("Purchased Coke");
                        sumCoins -= 1.00;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                default:
                    //ако продуктът е невалиден
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sumCoins);
    }
}
//1
//1
//0.5
//0.6
//Start
//Coke
//Soda
//Crisps
//End
//Output:
//Cannot accept 0,60
//Purchased Coke
//Purchased Soda
//Sorry, not enough money
//Change 0,70