import java.util.Scanner;

public class _4_Backin30minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 30;
        //59 + 30 = 89 - 60 = 29
        if (minutes > 59){
            minutes -= 60;
            hour += 1;
            if (hour >= 24){
                hour = 0;
            }
        }
        if (minutes < 10){
            System.out.printf("%d:0%d",hour,minutes);
        }else{
            System.out.printf("%d:%d",hour,minutes);
        }

    }
}
// 11
// 08
//Output: 11:38