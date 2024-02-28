import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray(); //масив от числата -> "8 2 2 8 2" -> 8.0 2.0...
        Map<Double, Integer> counts = new TreeMap<>(); //асоциотивен масив - > брояч
        for (double num : nums) { // за всяко едно  число от nums
            if (!counts.containsKey(num)) { //ako не съдържа числото
                counts.put(num, 0); //добави числото
            }
            counts.put(num, counts.get(num) + 1); //презапиши стойноста и увеличи value-to с 1
        }
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            //може и без desimal format само с %.0f -> %d
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
//8 2 2 8 2

//output:
//2 -> 3
//8 -> 2
