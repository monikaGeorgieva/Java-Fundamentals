import java.util.Scanner;

public class _4_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int total = 0;
        for (int i = start;i <= end; i++){
            total += i;
            System.out.print(i + " ");
        }
        System.out.println();//  нов ред
        System.out.printf("Sum: %d %n",total);
    }
}
//5
//10
//output
//5 6 7 8 9 10
// Sum: 45