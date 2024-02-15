import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_MergingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        int minSize =  Math.min(firstList.size(),secondArray.size());

        for (int i = 0; i < minSize ; i++) {
            int numFirstList = firstList.get(i);
            int numSecondList = secondArray.get(i);

            resultList.add(numFirstList);
            resultList.add(numSecondList);
        }

        if (firstList.size() > secondArray.size()){
            resultList.addAll(firstList.subList(minSize, firstList.size()));
        } else if (secondArray.size() > firstList.size()) {
            resultList.addAll(secondArray.subList(minSize, secondArray.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));

    }
}
//3 5 2 43 12 3 54 10 23
//76 5 34 2 4 12
//output
//
