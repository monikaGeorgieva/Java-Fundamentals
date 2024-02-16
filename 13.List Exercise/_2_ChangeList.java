import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String  inputCommand = scanner.nextLine();

        while (!inputCommand.equals("end")){
            String [] coomandInput = inputCommand.split(" ");
            String command = coomandInput[0];
            switch (command){
                case "Delete":
                    int numberDelete = Integer.parseInt(coomandInput[1]);
                    numbersList.removeAll(Arrays.asList(numberDelete));
                    break;
                case "Insert":
                    int numberInsert = Integer.parseInt(coomandInput[1]);
                    int indexInsert = Integer.parseInt(coomandInput[2]);
                    numbersList.add(indexInsert,numberInsert);
                    break;
            }

            inputCommand = scanner.nextLine();
        }
        for (int element: numbersList) {
            System.out.print(element + " ");
        }


    }
}
//1 2 3 4 5 5 5 6
//Delete 5
//Insert 10 1
//Delete 5
//end
//output
//1 10 2 3 4 6