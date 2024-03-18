import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex); //шаблон
        Matcher matcher = pattern.matcher(text);//съвпадения
        List<String> validNumbers = new ArrayList<>();
        while (matcher.find()){
            validNumbers.add(matcher.group());
        }
        System.out.println(String.join(", ",validNumbers));
    }
}
// regex of regex101 --> \+359([ -])2\1\d{3}\1\d{4}\b

//+359 2 222 2222,359-2-222-2222, +359/2/222/2222, +359-2 222 2222 +359 2-222-2222,
//+359-2-222-222, +359-2-222-22222 +359-2-222-2222
