import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1_Furniture {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();
       String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+|[0-9]+\\.[0-9]+)!(?<quntity>[0-9]+)";
       //>>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+|[0-9]+\.[0-9]+)!(?<quntity>[0-9]+)
        //>>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\.?[0-9]*)!(?<quntity>[0-9]+)
        Pattern pattern = Pattern.compile(regex);
        List<String> furnitureList = new ArrayList<>();
        Double totalPrice = 0.0;
        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String furniture = matcher.group("furniture");
                furnitureList.add(furniture);
                Double price =Double.parseDouble(matcher.group("price"));
                Integer quntity = Integer.parseInt(matcher.group("quntity"));
                double priceFurniture = price * quntity * 1.00;
                totalPrice += priceFurniture;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalPrice);

    }
}
//>>Sofa<<312.23!3
//>>TV<<300!5
//>Invalid<<!5
//Purchase

//output
//Bought furniture:
//Sofa
//TV
//Total money spend: 2436,69
