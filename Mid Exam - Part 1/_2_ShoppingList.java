import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_ShoppingList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Go Shopping!")) {

            String command = input.split(" ")[0];
            String item = input.split(" ")[1];

            switch (command) {
                case "Urgent":
                    if (!items.contains(item)) {
                        items.add(0, item);
                    }
                    //Urgent {item} - add the item at the start of the list.
                    //     If the item already exists, skip this command.
                    break;
                case "Unnecessary":
                    items.remove(item);
                    break;
                case "Correct":
                    //· Correct {oldItem} {newItem} – if the item with the given old name exists,
                    // change its name with the new one.
                    if (items.contains(item)) {
                        String newItem = input.split(" ")[2];
                        int itemIndex = items.indexOf(item);
                        items.set(itemIndex, newItem);
                    }
                    break;
                case "Rearrange":
                    // //· Rearrange {item} - if the grocery exists in the list,
                    //remove it from its current position and add it at the end of the list
                    if (items.contains(item)){
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        // System.out.println(items.toString().replace("[", "").replace("]", ""));

        // САМО ЗА List<String>
        System.out.println(String.join(", ", items));
    }
}
//Tomatoes!Potatoes!Bread
//Unnecessary Milk
//Urgent Tomatoes
//Go Shopping!

//output
//Tomatoes, Potatoes, Bread