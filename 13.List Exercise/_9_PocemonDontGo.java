import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _9_PocemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemoved = 0; //сума на прехнатите елементи

        //повтаряме: въвеждаме индекс (цяло число)
        //стоп : списъка стане празен --> size <= 0
        //продължаваме: списъка е пълен --> size > 0


    }
}
