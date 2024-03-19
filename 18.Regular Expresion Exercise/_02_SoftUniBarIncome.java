import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "%(?<customer>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        //%(?<customer>[A-Z][a-z]+)%<(?<product>[\w]+)>\|(?<count>[0-9]+)\|(?<price>[0-9]+\.?[0-9]*)\$
        Pattern pattern = Pattern.compile(regex);
        double total = 0;
        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                Integer count = Integer.parseInt(matcher.group("count"));
                Double price = Double.parseDouble(matcher.group("price"));
                double priceEach = count * price;
                System.out.printf("%s: %s - %.2f\n",customer,product,priceEach);
                total += priceEach;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f\n",total);
    }
}
//%George%<Croissant>|2|10.3$
//%Peter%<Gum>|1|1.3$
//%Maria%<Cola>|1|2.4$
//end of shift
