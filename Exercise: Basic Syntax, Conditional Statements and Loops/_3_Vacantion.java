import java.util.Scanner;

public class _3_Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String day = scanner.nextLine();
        double total = 0;

        switch (typePeople){
            case "Students":
                switch (day){
                    case "Friday":
                        total = countPeople * 8.45;
                        break;
                    case "Saturday":
                        total = countPeople * 9.80;
                        break;
                    case "Sunday":
                        total = countPeople * 10.46;
                        break;
                }
                if (countPeople >= 30){
                    total -= total * 0.15;
                }
                break;
            case "Business":
                if (countPeople >= 100){
                    countPeople -= 10;
                }
                switch (day){
                    case "Friday":
                        total = countPeople * 10.90;
                        break;
                    case "Saturday":
                        total = countPeople * 15.60;
                        break;
                    case "Sunday":
                        total = countPeople * 16;
                        break;
                }
                break;
            case "Regular":
                switch (day){
                    case "Friday":
                        total = countPeople * 15;
                        break;
                    case "Saturday":
                        total = countPeople * 20;
                        break;
                    case "Sunday":
                        total = countPeople * 22.50;
                        break;
                }
                if (countPeople >= 10 && countPeople <= 20){
                    total -= total * 0.05;
                }
                break;
        }
        System.out.printf("Total price: %.2f",total);
    }
}
//40
//Regular
//Saturday
//Output
//Total price: 800,00