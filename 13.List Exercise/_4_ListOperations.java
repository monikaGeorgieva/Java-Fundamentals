import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commandInput = scanner.nextLine();
        while (!commandInput.equals("End")){
            String [] commandSplit = commandInput.split("\\s+");
            String command = commandSplit[0];
            switch (command){
                case "Add":
                    int numberAdd = Integer.parseInt(commandSplit[1]);
                    numberList.add(numberAdd);
                    break;
                case "Insert":
                    int numberInsert = Integer.parseInt(commandSplit[1]);
                    int indexInsert = Integer.parseInt(commandSplit[2]);
                    if (isValidIndex(indexInsert,numberList)){
                        numberList.add(indexInsert,numberInsert);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(commandSplit[1]);
                    if (isValidIndex(indexRemove,numberList)){
                        numberList.remove(indexRemove);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String commandShift = commandSplit[1];
                    switch (commandShift){
                        case "left":
                            int countShiftLeft = Integer.parseInt(commandSplit[2]);
                                //повтаряме нещо -> countShiftLeft
                                //first number becomes last
                                //{3, 4, 6, 7, 1}
                                for (int time = 1; time <= countShiftLeft ; time++) {
                                    int firstNumber = numberList.get(0); //взимаме 1вото число
                                    numberList.remove(0); //премахвам по индекс
                                    numberList.add(firstNumber); //добавям най-отзад
                                }
                            break;
                        case "right":
                            int countShiftRight = Integer.parseInt(commandSplit[2]);
                                //повтарям -> countShiftRight
                                //last number becomes first
                                //{3, 4, 6, 7, 1}
                                for (int time = countShiftRight; time >= 1 ; time--) {
                                    int lastNumber = numberList.get(numberList.size() - 1); //взимаме последното число
                                    numberList.remove(numberList.size() - 1); //премахвам по индекс
                                    numberList.add(0,lastNumber); //добавям най-отпред
                                }
                            break;
                    }
                    break;
            }
            commandInput = scanner.nextLine();
        }
        for (int element: numberList) {
            System.out.print(element + " ");
        }
    }

    public  static boolean isValidIndex(int index,List<Integer> numberList){
          return   index >= 0 && index <= numberList.size() - 1;
        //метод проверяващ дали даден индекс е валиден
    }
}
//вариант 1
//1 23 29 18 43 21 20
//Add 5
//Remove 5
//Shift left 3
//Shift left 1
//End
//output
//43 20 5 1 23 29 18

//вариант 2
//5 12 42 95 32 1
//Insert  3 0
//Remove 10
//Insert 8 6
//Shift right 1
//Shift left 2
//End
//output
//Invalid index
// 5 12 42 95 32 8 1 3


