import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <=numbers.length -1 ; index++) {
            int currentNumber = numbers[index];

            int leftSum = 0;
            int rightSum = 0;
            //1.намиране на сумата на елементите в ляво
            for (int leftIndex = 0; leftIndex < index ; leftIndex++) {
                leftSum += numbers[leftIndex];
            }
            //2.намиране на сумата на елементите в дясно
            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1 ; rightIndex++) {
                rightSum += numbers[rightIndex];
            }
            //3.проверка дали са равни двете суми -> имаме намерено такова число
            if (leftSum == rightSum){
                System.out.println(index);
                return;
            }
        }
        //обходили сме всички числа и нито едно не е отговаряло на условието
        System.out.println("no");

    }
}
//1 2 3
//no
