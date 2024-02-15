import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _2_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //first + last,first + 1 + last,first + 2 last,.. first + n,last - n.
        // 1 2 3 4 5  --> 6 6 3
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sizeList = numbersList.size();
        for (int i = 0; i < sizeList / 2; i++) {
            int firstNum = numbersList.get(i);
            int lastNum = numbersList.get(numbersList.size() - 1);

            numbersList.set(i, firstNum + lastNum);
            numbersList.remove(numbersList.size() - 1);
            //заедно с премахването на елемента намалява и дължината му
        }

        for (int number: numbersList) {
            System.out.print(number + " ");
        }
    }
}
//1 2 3 4 5
//6 6 3
