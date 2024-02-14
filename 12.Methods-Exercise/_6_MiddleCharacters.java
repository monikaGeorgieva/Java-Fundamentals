import java.util.Scanner;

public class _6_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        findMiddleChar(text);
    }
    public static void findMiddleChar(String text){
       int length = text.length();

       if (length % 2 != 0){
           int indexOfMiddle = length / 2 ;
           System.out.println(text.charAt(indexOfMiddle));
       }else {
           int indexOfFirstMiddleChar = length / 2 - 1;
           int indexOfSecondMiddleChar = length / 2;
           System.out.print(text.charAt(indexOfFirstMiddleChar));
           System.out.print(text.charAt(indexOfSecondMiddleChar));
       }
    }
}
//monika
//ni