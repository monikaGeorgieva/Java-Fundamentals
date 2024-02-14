import java.util.Scanner;

public class _9_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){

            System.out.println(isInputPalindrome(input));
            input = scanner.nextLine();
        }
    }
    public static boolean isInputPalindrome(String input){
        String reversedString = "";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            reversedString += input.charAt(i);
        }

        return input.equals(reversedString);
    }
}
//123
//323
//421
//121
//END
//OUTPUT
//false
//true
//false
//true
