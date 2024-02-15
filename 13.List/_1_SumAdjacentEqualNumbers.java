import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3 3 6 1 -- > output: 12 1
        //explanation -> 3 3 6 1 -> 6 6 1 -> 12 1

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbersList.size(); i++) {
            if (i == numbersList.size() - 1){
                break;
                //прекъсни цикъла за да не сравняваме последното число с нищо накрая
            }
            double currentNum = numbersList.get(i);
            double nextNum = numbersList.get(i + 1);
            //проверка дали числата са равни
            if (currentNum == nextNum){
                numbersList.set(i, currentNum + nextNum); // ако са равни събери числата
                numbersList.remove(i + 1); // премахни числото което събираме
                i = -1; //започни проверката отначало -1 + 1 = 0левия индекс
            }
        }
        System.out.println(joinElementsByDelimiter(numbersList," "));
    }
    public static String joinElementsByDelimiter(List<Double>list,String delimiter){
        DecimalFormat df = new DecimalFormat("0.#");
        String result = "";
        for (double item: list) { // 3.00
            String numberDf = df.format(item) + delimiter;
            result += numberDf;
        }
        return result;
    }
}
//3 3 6 1
//12 1
