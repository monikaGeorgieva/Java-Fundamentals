import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1_MatchFullName {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String text = scanner.nextLine();
      String regex = "\\b([A-Z][a-z]+) ([A-Z][a-z]+)";
        Pattern pattern = Pattern.compile(regex); //създаваме шаблон
        Matcher matcher = pattern.matcher(text);

      //  matcher.find() --> следващото попадение true/falce
        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
//peter georgiev, peter Georgiev, Peter GeoRgiev, PEter GEorgiev, Peter Georgiev, Anna
//Petrova
