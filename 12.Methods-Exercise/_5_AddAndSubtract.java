import java.util.Scanner;

public class _5_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sum = sumTwoNumbers(first,second);
        int result = subtract(sum,third);
        System.out.println(result);
    }
    public static int sumTwoNumbers(int num1,int num2){
        return num1 + num2;
    }
    public static int subtract(int num1,int num2){
        return num1 - num2;
    }
}
//23
//6
//10
//output
//19