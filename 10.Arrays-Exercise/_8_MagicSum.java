import java.util.Arrays;
import java.util.Scanner;

public class _8_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            //1.входни данни
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());
        //2.обхождаме всички числа от масива
        for (int index = 0; index <= numbers.length - 1 ; index++) {
            int currentNumber = numbers[index];
            //всички числа след него
            for (int i = index + 1; i <= numbers.length - 1 ; i++) {
                int nextNumber = numbers[i]; //числото след моето
                //currentNumber nextNumber
                if (currentNumber + nextNumber == magicSum){
                    System.out.println(currentNumber + " " + nextNumber);
                }

            }

        }
    }
}
