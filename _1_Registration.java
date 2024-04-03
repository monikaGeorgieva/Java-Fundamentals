import java.util.Scanner;

public class _1_Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Registration")) {
            String[] commandParts = command.split("\\s");
            String commandName = commandParts[0];

            switch (commandName) {

                case "Letters":
                    //    • "Letters {Lower/Upper}"
                    //        ◦ Replace all letters with lower case or with upper case,
                    //        then print the result.
                    String upperOrLower = commandParts[1];
                    if (upperOrLower.equals("Upper")) {
                        userName = userName.toUpperCase();
                    } else if (upperOrLower.equals("Lower")) {
                        userName = userName.toLowerCase();
                    }
                    System.out.println(userName);

                    break;

                case "Reverse":
                    //    • "Reverse {startIndex} {endIndex}"
                    //        ◦ Reverse the substring from the start index
                    //        until the end index (both inclusive),
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);

                    if ((startIndex >= 0 && startIndex < userName.length()) && (endIndex >= 0 && endIndex < userName.length())) {

                        String subst = userName.substring(startIndex, endIndex + 1);
                        StringBuilder sb = new StringBuilder(subst).reverse();
                        System.out.println(sb);
                    }
                    break;
                case "Substring":
                    //Substring {substring}"
                    String substring = commandParts[1];
                    //If the username contains the given substring, CUT it out
                    if (userName.contains(substring)) {
                        String replacement = "";
                        userName = userName.replace(substring, replacement);
                        System.out.println(userName);

                    } else {
                        System.out.printf("The username %s doesn't contain %s.%n", userName, substring);
                    }
                    break;

                case "Replace":
                    //"Replace {char}"
                    //Replace all occurences of the given char with a dash (-)
                    String textToReplace = commandParts[1];
                    String replacement = "-";

                    userName = userName.replace(textToReplace, replacement);
                    System.out.println(userName);
                    break;

                case "IsValid":
                    //"IsValid {char}"
                    String character = commandParts[1];

                    if (userName.contains(character)) {
                        System.out.println("Valid username.");
                    } else {
                        System.out.println(character + " must be contained in your username.");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
//John
//Letters Lower
//Substring SA
//IsValid @
//Registration

//ThisIsSoftUni
//Reverse 1 3
//Replace S
//Substring hi
//Registration