import java.util.Scanner;

public class ValidUsername01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] usernames = input.split(", ");

        for (String username: usernames) {
            if (isValidUsername(username)){
                System.out.println(username);
            }
        }

    }
    public static boolean isValidUsername(String username){
        //проверка на дължината
        if (username.length() < 3 || username.length() > 16){
            //невалидна дължина -> невалиден username
            return false;
        }
        //валидно съдържание - > букви, цифри, -'/.,
        for (char symbol: username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                //невалиден символ -> невалиден username
                return false;
            }
        }
        //валидно съдържание
        return true;
    }
}
//sh, too_long_username, !lleg@l ch@rs, jeffbutt
//jeffbutt
