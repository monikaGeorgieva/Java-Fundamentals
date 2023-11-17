import java.util.Scanner;

public class _5_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimeter = scanner.nextLine();

        System.out.println(name1 + delimeter + name2);
    }
}
//Jan
//White
//<->
//output
//Jan<->White
