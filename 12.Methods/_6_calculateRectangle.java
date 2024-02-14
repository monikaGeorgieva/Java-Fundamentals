import java.util.Scanner;

public class _6_calculateRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double area = CalculateArea(a,b);
        System.out.printf("%.0f \n",area);
    }
    public static double CalculateArea(double a,double b){
        return  a * b;
    }
}
//3
//3
//9