import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_ListManipulationBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersListInput = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("end")){
            String[] commandArr = inputCommand.split(" ");
            String command = commandArr[0];

            switch (command){
                case "Add":
                    int numToAdd = Integer.parseInt(commandArr[1]);
                    numbersListInput.add(numToAdd);
                    //добавяме елемент накрая на листа
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandArr[1]);
                    numbersListInput.remove(Integer.valueOf(numToRemove));
                    // премахваме числото
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(commandArr[1]);
                    numbersListInput.remove(indexRemove);
                    //премахваме на индекса
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandArr[1]); //число за добавяне
                    int indexToInsert = Integer.parseInt(commandArr[2]); // на индекс
                    numbersListInput.add(indexToInsert,numberToInsert);
                    break;
            }
            inputCommand = scanner.nextLine();
        }

        System.out.println(numbersListInput.toString().replaceAll("[\\[\\],]",""));
//        for (Integer element: numbersListInput) {
//            System.out.print(element + " ");
        //принтиране на резултат 2ри начин
//        }
    }
}
//4 19 2 53 6 43
//Add 3
//Remove 2
//RemoveAt 1
//Insert 8 3
//end
//output
//4 53 6 8 43 3