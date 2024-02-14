import java.util.Scanner;

public class _7_repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        String result = repeatMethod(string,number);
        System.out.println(result);
    }
    public static String repeatMethod(String string,int number){
        String[] result = new String[number];
        for (int i = 0; i < number ; i++) {
            result[i] = string;
        }
        return String.join( "",result);
    }
}
