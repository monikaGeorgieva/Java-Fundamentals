import java.util.Scanner;

public class _6_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Factoriel of numbers

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number; //въведеното число,което не се променя
        int sumFack = 0;
        while (number > 0){
            //1 Взимаме последната цифра или единствената цифра
            int lastDigit = number % 10;
            //2 Обрабоваме цифрата --> факториел
            int fack = 1; //факториела на цифрата
            //9! = 1*2*3*4*5*6*7*8*9;
            for (int i = 1; i <= lastDigit; i++){
                fack = fack * i;
            }
               sumFack += fack;
            //3 Премахваме цифрата
            number = number / 10;
        }
        if (sumFack == startNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
