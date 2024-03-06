import java.util.Scanner;

public class LetterChangeNumbers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //"P34562Z q2576f   H456z"
        String [] codes = input.split("\\s+"); // ["P34562Z","q2576f","H456z"]

        double totalSum = 0;
        for (String code: codes) {
            //code: {буква}{число}{буква} =>   P34562Z
            //1.модифицирам числото в кода спрямо буквите
            double modifiedNumber = getModifiedNumber(code);
            //2.сумирам модифицираното число
            totalSum += modifiedNumber;
        }

        System.out.printf("%.2f",totalSum);
    }

    private static double getModifiedNumber(String code) {
        //code: {буква}{число}{буква} =>   "P234Z"
        char letterBefore = code.charAt(0); // "P"
        char letterAfter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(letterBefore,' ')
                .replace(letterAfter,' ')
                .trim()); // 234
        //модификация спрямо буквата -> letterBefore
        if (Character.isUpperCase(letterBefore)){
            //главна -> А(65) --> Z(90)
            int positionUppwerLetter = (int) letterBefore - 64;
            number /= positionUppwerLetter;
            //number = number / positionUpperLetter
        }else {
            //малка -> а(97) --> z(122)
            int positionLowerLetter = (int) letterBefore - 96;
            number *= positionLowerLetter;
        }
        //модификацията спрямо буквата след -> letterAfter
        if (Character.isUpperCase(letterAfter)){
            //главна -> А(65) --> Z(90)
            int positionUppwerLetter = (int) letterAfter - 64;
            number -= positionUppwerLetter;
        }else {
            int positionLowerLetter = (int) letterAfter - 96;
            number += positionLowerLetter;
        }
        return number;
    }
}
//P34562Z q2576f H456z 
//46015,13
