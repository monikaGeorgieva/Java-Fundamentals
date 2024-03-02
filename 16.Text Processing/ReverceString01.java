import java.util.Scanner;

public class ReverceString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String reversed = "";
            for (int i = input.length() - 1; i >= 0; i--) {

                char symbol = input.charAt(i);
              reversed += symbol;
            }
            System.out.println(input + " = " + reversed );
            input = scanner.nextLine();
        }

    }
}
//helLo
//Softuni
//bottle
//end
