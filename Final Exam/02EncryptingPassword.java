import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercise2 {
    //02. Encrypting Password
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String regex = "([A-Za-z0-9]+|[^\\w]+)>(?<numbers>[0-9]{3,})\\|(?<lowercase>[a-z]{3,})\\|(?<uppercase>[A-Z]{3,})\\|(?<symbols>[A-Za-z0-9]+|[^\\w]+)<\\1";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= count ; i++) {
            String passwords = scanner.nextLine();
            Matcher matcher = pattern.matcher(passwords);
            if (matcher.find()){
                String numbers = matcher.group("numbers");
                String lowercase = matcher.group("lowercase");
                String uppercase = matcher.group("uppercase");
                String symbols = matcher.group("symbols");
//                StringBuilder sb = new StringBuilder();
//                sb.append(numbers).append(lowercase).append(uppercase).append(symbols);
                String newText = numbers + lowercase + uppercase + symbols;
                System.out.printf("Password: %s\n",newText);
            }else {
                System.out.println("Try another password!");
            }
        }
    }
}
//3
//##>00|no|NO|!!!?<###
//##>123|yes|YES|!!!<##
//$$<111|noo|NOPE|<<>$$

//output:
//Try another password!
//Password: 123yesYES!!!
//Try another password!

//5
//aa>111|mqu|BAU|mqu<aa
//()>111!aaa!AAA!^&*<()
//o>088|abc|AAA|***<o
//asd>asd|asd|ASD|asd<asd
//*>088|zzzz|ZzZ|123<*
