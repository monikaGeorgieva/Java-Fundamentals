import java.util.Scanner;

public class _7_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(n +" ");
            }
            System.out.println();
        }

    }
}
//3
//output
//3 3 3
//3 3 3
//3 3 3