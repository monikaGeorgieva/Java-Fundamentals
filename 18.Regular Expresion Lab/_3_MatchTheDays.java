import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _3_MatchTheDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\b(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        String datesStrings = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher dates = pattern.matcher(datesStrings);

        while (dates.find()){
            String day = dates.group("day");
            String month = dates.group("month");
            String year = dates.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s\n",day,month,year);
        }
    }
}
//13/Jul/1928, 10-Nov-1934, , 01/Jan-1951,f 25.Dec.1937 23/09/1973, 1/Feb/2016
//output:
//Day: 13, Month: Jul, Year: 1928
//Day: 10, Month: Nov, Year: 1934
//Day: 25, Month: Dec, Year: 1937
