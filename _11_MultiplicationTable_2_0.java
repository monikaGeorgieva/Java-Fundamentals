import java.util.Scanner;

public class _11_MultiplicationTable_2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theInteger = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());
        int result = 0;
        if (times > 10){
            result = theInteger * times;
            System.out.printf("%d X %d = %d",theInteger,times,result);
        }
        while (times <= 10){
            result = theInteger * times;
            System.out.printf("%d X %d = %d\n",theInteger,times,result);
            times += 1;
        }

    }
}
//2
//14
//OutPut
//2 X 14 = 28