import java.util.Scanner;

public class _3_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= size ; i++) {
           printLine(i);
        }
        for (int i = size - 1; i >= 1 ; i--) {
            printLine(i);
        }
    }
    public static void printLine(int elementsCount){
        for (int i = 1; i <= elementsCount ; i++) {
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
}
//3
//output
//1
//1 2
//1 2 3
//1 2
//1