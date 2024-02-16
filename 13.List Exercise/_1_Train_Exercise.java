import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_Train_Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()); //32 54 21 12 4 0 23

        int maxCapacity = Integer.parseInt(scanner.nextLine()); //75
        String command = scanner.nextLine();
        while (!command.equals("end")){

            if(command.contains("Add")){
                //1. "Add 40" --> ["Add", "40"]
                    int addNumber = Integer.parseInt(command.split(" ")[1]);
                    wagonsList.add(addNumber);
            }else {
                //2. "40"
                int passengerToADD = Integer.parseInt(command);
                for (int possition = 0; possition <= wagonsList.size() - 1 ; possition++) {
                    int wagon = wagonsList.get(possition);

                    if (wagon + passengerToADD <= maxCapacity){
                        wagonsList.set(possition,wagon + passengerToADD);
                        //add the passengers if there is space
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (Integer wagon : wagonsList) {
            System.out.print(wagon + " ");
        }
    }
}
