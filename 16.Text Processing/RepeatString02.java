import java.util.Scanner;

public class RepeatString02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split(" ");
        int size = 0;
        for (String word:words) {
           size = word.length();
            for (int i = 0; i < size; i++) {
                System.out.print(word);
            }
        }
    }
}
//hi abc add
//output
//hihiabcabcabcaddaddadd
