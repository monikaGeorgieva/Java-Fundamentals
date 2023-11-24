import java.util.Scanner;

public class _2_PrintNumbersInReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine()); //n:3
        int[] numbers = new int[n]; // numbers: [10,20,30]

        for (int i = 0; i < n ; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine()); //взима числата и ги слага в масива
        }
        for (int i = n -1; i >= 0 ; i--) { //принтира числата в обратен ред
            System.out.printf("%d ",numbers[i]);
        }

    }
}
//3
//10
//20
//30
//output
//30 20 10