import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //текс -> "text"

        //запис: символ -> бр. срещания
        Map<Character,Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()) {

            if (symbol == ' '){
                //преверка за интервал
                continue;
            }
            //проверка дали сме го срещали
            if (symbolsCount.containsKey(symbol)){
                int currentCount = symbolsCount.get(symbol);
                //symbolCount.get(symbol) -- > стойноста,която се намира на този ключ
                symbolsCount.put(symbol,currentCount + 1);
            }else {
                symbolsCount.put(symbol, 1);
                //проверка дали не сме го срещали
            }
        }
        for (Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
          //entry.getKey() -> символ
            //entry.getValue() -- > брой срещания
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
//text
//output
//t -> 2
//e -> 1
//x -> 1
