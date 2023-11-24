import java.util.Scanner;

public class _4_ReverceArrayofStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        String[] reversed = new String[elements.length];

        int revesedIdx = 0;
        for (int i = elements.length - 1; i >= 0 ; i--) {
            reversed[revesedIdx] = elements[i];
            revesedIdx += 1;
        }
        System.out.println(String.join(" ",reversed));
    }
}
//a b c d e
//output
//e d c b a