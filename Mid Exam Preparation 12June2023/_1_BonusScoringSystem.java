import java.util.Scanner;

public class _1_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countStudents = Integer.parseInt(scanner.nextLine());
        int countLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double totalBonus = 0;
        double maxBonus = 0;
        int lecture = 0;
        for (int student = 0; student < countStudents ; student++) {
            int studentAtendances = Integer.parseInt(scanner.nextLine());
            totalBonus = studentAtendances * 1.00 / countLectures * (5 + additionalBonus);
            if (totalBonus > maxBonus){
                maxBonus = totalBonus;
                lecture = studentAtendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.",Math.ceil(maxBonus));
        System.out.println();
        System.out.printf("The student has attended %d lectures.",lecture);

    }
}
