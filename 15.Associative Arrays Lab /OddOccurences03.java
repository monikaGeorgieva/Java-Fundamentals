import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] inputArray = scanner.nextLine().split(" ");
        LinkedHashMap<String,Integer> wordsMap = new LinkedHashMap<>();
        for (String word : inputArray){
            word = word.toLowerCase();

            wordsMap.putIfAbsent(word,0);
            wordsMap.put(word,wordsMap.get(word) + 1);

/*
            if (wordsMap.containsKey(word)){
                wordsMap.put(word,wordsMap.get(word) + 1);
            }else {
                wordsMap.put(word,1);
            }
*/
        }
        ArrayList<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0){
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",resultList));

    }
}
//Java C# PHP PHP JAVA C java
//output
//java, c#, c
