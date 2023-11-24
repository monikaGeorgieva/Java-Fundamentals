import java.util.Scanner;

public class _1_DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] days = {"Monday","Tuesday","Wednesday","Thursday",
        "Friday","Saturday","Sunday"}; //array

        int day = Integer.parseInt(scanner.nextLine()); //integer input
        if (day >= 1 && day <= 7){ //or days <= days.length
            System.out.println(days[day - 1]);
        }else{
            System.out.println("Invalid day!");
        }
    }
}
//5
//output
//Friday
