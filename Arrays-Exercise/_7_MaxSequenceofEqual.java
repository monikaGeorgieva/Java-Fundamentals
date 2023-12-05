import java.util.Arrays;
import java.util.Scanner;

public class _7_MaxSequenceofEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int lenght = 1; //дължината на дадена поредица
        int maxLenght = 0;
        int startIndex = 0;
        int bestStartIndex = 0;
        //2 1 1 2 3 3 2 2 2 1
        for (int i = 1; i <=array.length -1 ; i++) {
            if (array[i] == array[i - 1]){
                lenght++;
            }else {
                lenght = 1;
                startIndex = i;
            }

            if (lenght > maxLenght){
                maxLenght = lenght;
                bestStartIndex = startIndex;
            }
        }
        for (int i = bestStartIndex ; i < bestStartIndex + maxLenght ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
//2 1 1 2 3 3 2 2 2 1
//2 2 2
