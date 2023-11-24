import java.util.Arrays;
import java.util.Scanner;

public class _5_EvenandOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();  // numbers [1, 2, 3, 4, 5, 6]
        int oddSum = 0;
        int evenSum = 0;

        for (int number : numbers){
            if (number % 2 == 0){  // 1,2,3,4,5,6
                evenSum += number;
            }else{
                oddSum += number;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
//1 2 3 4 5 6
//3