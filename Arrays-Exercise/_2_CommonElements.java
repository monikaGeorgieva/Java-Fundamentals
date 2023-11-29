import java.util.Scanner;

public class _2_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.входни данни
        String firstRow = scanner.nextLine(); //"Hey hello 2 4"
        String secondRow = scanner.nextLine(); //"10 hey 4 hello"

        //2.Вкарване на входните данни в масив и разделяне по място " "
        String [] firstArray = firstRow.split(" ");
        String [] secondArray = secondRow.split(" ");

        //за всеки елемент на втория масив -> проверявам дали съвпада със първия
        for (String el2 : secondArray) {
            for (String el1 : firstArray) {
                if (el2.equals(el1)){ //сравняваме елементите
                    System.out.print(el2 + " "); //принтиране
                }
            }
        }
    }
}
//Hey hello 2 4
//10 hey 4 hello
//output
//4 hello
