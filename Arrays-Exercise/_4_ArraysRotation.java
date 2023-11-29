import java.util.Arrays;
import java.util.Scanner;

public class _4_ArraysRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine() //"51 47 32 61 21"
               .split(" ")) //["51","47","32","61","21"]
               .mapToInt(Integer::parseInt) //[51,47,32,61,21]
                .toArray();
        
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int rotation = 1; rotation <= rotations ; rotation++) {
            //ротация на масив
            //1.взимаме първия елемент
            int firstElement = numbers[0]; //51
            //2.преместваме елементите(копираме) наляво
            //[51,47,32,61,21] --> [47,32,61,21,51]
            for (int index = 0; index < numbers.length -1 ; index++) {
                numbers[index] = numbers[index + 1];
            }
            //3.поставяме първия елемент на последното място
            numbers[numbers.length - 1] = firstElement;
        }
        //приключили с потациите -> принтитаме елементите на масива
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}
