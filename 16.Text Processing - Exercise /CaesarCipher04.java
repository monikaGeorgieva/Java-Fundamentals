import java.util.Scanner;

public class CaesarCipher04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (char symbol: text.toCharArray()) {
            //'A' -- > 'D'
            char encryptSymbol = (char) (symbol + 3); // symbol: 'P' 80
            encryptedText.append(encryptSymbol);
        }
        System.out.println(encryptedText);
    }
}
//Programming is cool!
//output
//Surjudpplqj#lv#frro$
