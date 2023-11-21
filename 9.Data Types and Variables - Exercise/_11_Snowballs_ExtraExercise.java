import java.util.Scanner;

public class _11_Snowballs_ExtraExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double maxSnowballValue = Double.MIN_VALUE;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnoqballQuality = 0;
        for (int i = 1; i <= n ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow * 1.00 / snowballTime),snowballQuality);
            if (snowballValue > maxSnowballValue){
                maxSnowballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnoqballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow,maxSnowballTime,maxSnowballValue,maxSnoqballQuality);

    }
}
//3
//10
//5
//7
//16
//4
//2
//20
//2
//2
//output
//10 : 5 = 128 (7)