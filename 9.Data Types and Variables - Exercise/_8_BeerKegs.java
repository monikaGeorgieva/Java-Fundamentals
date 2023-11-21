import java.util.Scanner;

public class _8_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String maxModelName = "";

        for (int i = 1; i <= n ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius * radius * height;
            if (volume > maxVolume){
                maxVolume = volume;
                maxModelName = model;
            }
        }
        System.out.printf("%s",maxModelName);
    }
}
//2
//Smaller Keg
//2.41
//10
//Bigger Keg
//5.12
//20
//Output
//Bigger Keg