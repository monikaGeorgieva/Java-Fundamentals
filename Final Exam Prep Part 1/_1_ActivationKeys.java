import java.util.Scanner;

public class _1_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Generate")){
            String [] commandParts = command.split(">>>");
            String commandName = commandParts[0];
            switch (commandName){
                case "Slice":
                    //Slice>>>{startIndex}>>>{endIndex}":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    StringBuilder sb = new StringBuilder(activationKey);
                    //изтриваме елементите от startIndex до endIndex
                    sb.delete(startIndex,endIndex);
                    activationKey = sb.toString(); //-> превръщаме обратно в стринг
                    System.out.println(activationKey);
                break;
                case "Flip":
                    //Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
                    //Change to lower or uppercase
                    String commandFlip = commandParts[1];
                    int startIndexFlip = Integer.parseInt(commandParts[2]);
                    int endIndexFlip = Integer.parseInt(commandParts[3]);
                    String stringToReplace = activationKey.substring(startIndexFlip,endIndexFlip);
                    String newText = "";
                    switch (commandFlip){
                        case "Upper":
                          newText =  stringToReplace.toUpperCase();
                            break;
                        case "Lower":
                          newText = stringToReplace.toLowerCase();
                            break;

                    }
                    activationKey = activationKey.replace(stringToReplace,newText);
                    System.out.println(activationKey);
                    break;
                case "Contains":
                    String substring = commandParts[1];
                    //проверка дали този текст се съдържа?
                    if (activationKey.contains(substring)){
                        System.out.printf("%s contains %s\n",activationKey,substring);
                    }else {
                        System.out.printf("Substring not found!\n");
                    }
                    break;

            }
            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s\n",activationKey);
    }
}
//abcdefghijklmnopqrstuvwxyz
//Slice>>>2>>>6
//Flip>>>Upper>>>3>>>14
//Flip>>>Lower>>>5>>>7
//Contains>>>def
//Contains>>>deF
//Generate
