import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _9_ArrayModifier_examExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //повтаряме: въвеждаме команди
        //стоп: въведем "stop"
        //продължаваме: въведеното != "end"
        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.contains("swap")){
               //"swap {index1} {index2}" takes two elements and swap their places.
                //1.command = "swap 1 2".split(" ") -> ["swap", "1", "2"]
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[index1];
                int secondIndexNumber = numbers[index2];

                numbers[index1] = secondIndexNumber;
                numbers[index2] = firstIndexNumber;
            } else if (command.contains("multiply")) {
                //"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index. Save the product at the 1st index.
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[index1];
                int secondIndexNumber = numbers[index2];

                int product = firstIndexNumber * secondIndexNumber;
                numbers[index1] = product;
            } else if (command.equals("decrease")) {
                //"decrease" decreases all elements in the array with 1.
                for (int i = 0; i <= numbers.length - 1 ; i++) {
                    numbers[i] -= 1;
                }
            }
            command = scanner.nextLine();
        }
        //отпечатваме числата разделени с ", "
        //1ви начин
        System.out.println(Arrays.toString(numbers)
                .replace("[","")
                .replace("]","")
                );
        

    }
}
