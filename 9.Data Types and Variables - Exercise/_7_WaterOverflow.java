import java.util.Scanner;

public class _7_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int total = 0;
        for (int i = 1; i <= n ; i++) {
            int quantitiesWater = Integer.parseInt(scanner.nextLine());
            if (quantitiesWater <= 255 - total){
                total += quantitiesWater;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.printf("%d\n",total);

    }
}
//1
//1000
//output
//Insufficient capasity!
//0