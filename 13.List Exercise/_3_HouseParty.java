import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_HouseParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> guest = new ArrayList<>();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {

            String command = scanner.nextLine();
            String name = command.split(" ")[0];

            if (command.contains("not")) {
                //{name} is not going! -- > remove from list if exist
                if (guest.contains(name)) {
                    guest.remove(name);
                } else {
                    //if it doesn't exist --> print not in the list
                    System.out.printf("%s is not in the list!\n", name);
                }
            } else if (guest.contains(name)) {
                //"{name} is going!" -- > add on the list
                System.out.printf("%s is already in the list!\n", name);
            } else {
                guest.add(name);
            }
        }

        for (String name : guest) {
            System.out.println(name);
        }
    }
}
//4
//Allie is going!
//George is going!
//John is not going!
//George is not going!

//output
//John is not in the list!
// Allie
