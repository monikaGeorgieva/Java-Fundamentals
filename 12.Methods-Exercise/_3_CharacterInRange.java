import java.util.Scanner;

public class _3_CharacterInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        
        printChar(firstChar,secondChar);
    }
    public static void printChar(char firstChar,char secondChar){
            if (firstChar < secondChar){
                for (int i = firstChar + 1; i < secondChar ; i++) {
                    System.out.print((char) i + " ");
                }
            }else{
                for (int i = secondChar + 1; i < firstChar ; i++) {
                    System.out.print((char) i + " ");
                }
            }
    }
}
//C
//#
//output
//$ % & ' ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ; < = > ? @ A B