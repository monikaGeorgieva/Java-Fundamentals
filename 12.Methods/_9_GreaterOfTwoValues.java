import java.util.Scanner;

public class _9_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("int")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(a,b));
        } else if (type.equals("string")) {
            String firstStr = scanner.nextLine();
            String secondStr = scanner.nextLine();
            System.out.println(getMax(firstStr,secondStr));
        }else {
            char firstLetter = scanner.nextLine().charAt(0);
            char secondLetter = scanner.nextLine().charAt(0);
            System.out.println(getMax(firstLetter,secondLetter));
        }
    }
    public static int getMax(int a,int b){
        if (a > b){
            return a;
        }
        return b;
    }
    public static String getMax(String firstStr,String secondStr){
        if (firstStr.compareTo(secondStr) >= 0){
            return firstStr;
        }
        return secondStr;
    }
    public static char getMax(char firstLetter,char secondLetter){
        if (firstLetter > secondLetter){
            return firstLetter;
        }
        return  secondLetter;
    }
}
//string
//Ivan
//Todor
//output
//Todor