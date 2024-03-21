import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_ValidPasword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String regex = "_\\.+(?<password>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= count ; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                //валидна парола- категоризирам
               String textPassword = matcher.group("password"); //A1f23A
               StringBuilder sbDigits = new StringBuilder();
               for (char symbol : textPassword.toCharArray()){
                   if (Character.isDigit(symbol)){
                       //цифра
                       sbDigits.append(symbol);
                   }
               }
               //нямаме цифри в паролата -> група default
                if(sbDigits.length() == 0){
                    System.out.println("Group: default");
                }else {
                    //имаме цифри в паролата
                    System.out.println("Group: " + sbDigits);
                }
            }else {
                System.out.println("Invalid pass!");
            }
        }

    }
}
//3
//_...ChelseA_.
//_..Online1BankinG_.
//_.A1f23A_.

//вариант 2:
//5
//_.Online2BanK_.
//__.Pass2Da_.
//_.InvaliDitem_.
//_.My2Pass47S_...
//_...QAPassV_..
//оутпут 2:

//Group: 2
//Invalid pass!
//Invalid pass!
//Group: 247
//Group: default
