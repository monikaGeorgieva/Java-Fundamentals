import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> productsList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String commands = scanner.nextLine();
        while (!commands.equals("Go Shopping!")){
            String [] commandSplit = commands.split(" "); //превръщам командата в масив
            String command = commandSplit[0];

            String item = commandSplit[1];
            switch (command){
                case "Urgent":
                    if (!productsList.contains(item)){
                        //ако не се съдържа продукта
                        productsList.add(0,item);
                    }
                    break;
                case "Unnecessary":
                        productsList.remove(item);
                        //remove -премахва елемента само ако съществува
                    break;
                case "Correct":
                    //Correct {oldItem} {newItem} – if the item with the given old name exists,
                    // change its name with the
                    //new one. If it doesn't exist, skip this command.
                    String newItem = commandSplit[2];
                    if (productsList.contains(item)){
                        int index = productsList.indexOf(item);
                        productsList.set(index, newItem);
                    }
                    break;
                case "Rearrange":
                    if (productsList.contains(item)){
                        productsList.remove(item);
                        productsList.add(item);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println(String.join(", ",productsList));
    }
}
//вариант 1:
//Tomatoes!Potatoes!Bread
//Unnecessary Milk
//Urgent Tomatoes
//Go Shopping!

//вариант 2:
//Milk!Pepper!Salt!Water!Banana
//Urgent Salt
//Unnecessary Grapes
//Correct Pepper Onion
//Rearrange Grapes
//Correct Tomatoes Potatoes
//Go Shopping!

//output 2:
//Milk ,Onion ,Salt ,Water ,Banana
