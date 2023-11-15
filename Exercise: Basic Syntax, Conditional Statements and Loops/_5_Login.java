import java.util.Scanner;
public class _5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine(); //потребителско име
        String password = ""; // парола

        for (int position = username.length() - 1; position >= 0; position--){
            char currentSymbol = username.charAt(position);//символа на текущата позиция
            password += currentSymbol;
        }
        int counter = 0;
        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(password)){
            counter++;
            if (counter == 4){
                System.out.printf("User %s blocked!",username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
            System.out.printf("User %s logged in.",username);
    }
}
//Acer
//login
//go
//let me in
//recA