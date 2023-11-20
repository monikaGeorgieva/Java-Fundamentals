import java.util.Scanner;

public class _5_PrintPartofAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end ; i++) {
            int number = i;
            System.out.print((char)number + " ");
        }
    }
}
//60
//65
//< = > ? @ A
