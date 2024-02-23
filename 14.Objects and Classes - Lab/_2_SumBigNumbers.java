import java.math.BigInteger;
import java.util.Scanner;

public class _2_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());


        System.out.println(firstNumber.add(secondNumber));
    }
}
//923847238931983192462832102
//934572893617836459843471846187346

//output
//934573817465075391826664309019448
