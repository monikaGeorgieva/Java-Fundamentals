import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _6_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            String currentFruit = scanner.nextLine();
            products.add(currentFruit);
        }
        Collections.sort(products);
        for (int i = 0; i < products.size() ; i++) {
            System.out.printf("%d.%s",i + 1,products.get(i));
            System.out.println();
        }
    }
}
//4
//Potatoes
//Tomatoes
//Onion
//Apples

//output
//1.Apples
//2.Onion
//3.Potatoes
//4.Tomatoes