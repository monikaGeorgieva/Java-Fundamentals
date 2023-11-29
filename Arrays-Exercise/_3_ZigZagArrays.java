import java.util.Scanner;

public class _3_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int [] firstArray = new int[rows]; //firstArray: [0,0,0,0]
        int [] secondArray = new int[rows];//secondArray: [0,0,0,0]

        for (int row = 1; row <= rows; row++) {
            String input = scanner.nextLine(); // "1, 5"
            String [] numbers = input.split(" "); //-> ["1","5"]
            int number1 = Integer.parseInt(numbers[0]); //-> [1]
            int number2 = Integer.parseInt(numbers [1]);// -> [5]

            if (row % 2 == 0){
                //нечетен ред
                //number1 -> secondArray
                firstArray[row -1] = number1;
                //number2 -> firstArray
                secondArray[row -1] = number2;
            }else {
                //четен ред
                secondArray[row -1] = number1;
                firstArray[row - 1] = number2;
            }
        }
        //принтиране на числата
        for (int number: secondArray) {
            System.out.print(number + " ");
        }
        System.out.println(); //сваляме на нов ред
        for (int number: firstArray) {
            System.out.print(number + " ");
        }
    }
}
