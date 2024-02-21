
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class _3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        for (int item: numbers) {
            sum += item;
        }
        double avgValue = sum * 1.00 / numbers.size();

        List<Integer> resultList = new ArrayList<>();
        for (int item: numbers) {
            if (item > avgValue){
                resultList.add(item);
            }
        }
        Collections.sort(resultList); // 3 2 1 --> 1 2 3 -> сортираме в нарастващ
        Collections.reverse(resultList);// 3 2 1 -> обръщаме в намаляващ

        if (resultList.size() <= 5 && resultList.size() > 1){
            System.out.println(resultList.toString().replaceAll("[\\[\\],]",""));
        }else if(resultList.isEmpty()) {
            System.out.println("No");
        }else {
            resultList = resultList.stream().limit(5).collect(Collectors.toList());
            System.out.println(resultList.toString()
                    .replace("[","")
                    .replace("]","")
                    .replace(",",""));
        }
        //Print the above described numbers on a single line, space separated.
        // If less than 5 numbers hold the above
        // -mentioned property, print less than 5 numbers. Print "No" if no numbers hold the above property.
    }
}
