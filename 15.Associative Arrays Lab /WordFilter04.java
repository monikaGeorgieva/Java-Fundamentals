import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WordFilter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // String [] wordArrayExample = Arrays.stream(scanner.nextLine().split(" ")).filter(w -> w.length() % 2 == 0).toArray(String[]::new);
        // решение само на един ред и след това се принтира по същия начин
        String [] wordArray = scanner.nextLine().split(" ");
        ArrayList<String> resultList = new ArrayList<>();
        for (String item: wordArray){
            if (item.length() % 2 == 0){
                resultList.add(item);
            }
        }
        System.out.println(String.join(System.lineSeparator(),resultList));
    }
}
//kiwi orange banana apple

//output
//kiwi
//orange
//banana
