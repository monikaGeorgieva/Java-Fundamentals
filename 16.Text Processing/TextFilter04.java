import java.util.Scanner;

public class TextFilter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] bannedWordsArr = scanner.nextLine().split(", "); //Linux, Windows
        String text = scanner.nextLine();

        for (String banWord: bannedWordsArr) {
            String asteriks = repeatString(banWord); //"*****" -> използване на метода
            text = text.replace(banWord, asteriks); //заместване на думата в текста с -> "*****"
        }
        System.out.println(text);
    }
    public static String repeatString (String banWord){
        String result = "";
        for (int i = 0; i < banWord.length(); i++) {
            result = result + "*";
            //взима баннатата дума,заместа с толкова звезди колкото букви има думата
        }
        return result;
    }
}
//Linux, Windows
//It is not Linux, it is GNU/Linux. Linux is merely the kernel, while GNU adds the functionality. Therefore we owe it to them by calling the OS GNU/Linux! Sincerely, a Windows client
//It is not *****, it is GNU/*****. ***** is merely the kernel, while GNU adds the functionality. Therefore we owe it to them by calling the OS GNU/*****! Sincerely, a ******* client
