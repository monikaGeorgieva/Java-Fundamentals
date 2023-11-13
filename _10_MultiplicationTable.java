import java.util.Scanner;

public class _10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        while (counter <= 10){
            int result = counter * n;
            System.out.printf("%d X %d = %d\n",n,counter,result);
            counter += 1;
        }
    }
}
//5
//Output
//5 X 1 = 5
//5 X 2 = 10
//5 X 3 = 15
//5 X 4 = 20
//5 X 5 = 25
//5 X 6 = 30
//5 X 7 = 35
//5 X 8 = 40
//5 X 9 = 45
//5 X 10 = 50