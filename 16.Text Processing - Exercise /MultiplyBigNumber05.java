import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String seccond = scanner.nextLine();

        BigInteger firstNumber = new BigInteger(first);
        BigInteger secondNumber = new BigInteger(seccond);
        System.out.println(firstNumber.multiply(new BigInteger(secondNumber + "")));
    }
}
//923847238931983192462832102
//4
//3695388955727932769851328408
