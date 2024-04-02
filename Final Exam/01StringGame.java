import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //01String Game

        String text = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")){
            String [] commandParts = command.split(" ");
            String commandName = commandParts[0];
            switch (commandName){
                case "Change":
                    //Change {char} {replacement}"
                    String charToReplace = commandParts[1];
                    String replacement = commandParts[2];
                   text =  text.replace(charToReplace,replacement);
                    System.out.println(text);
                    break;
                case "Includes":
                    //Includes {substring}"
                    String substringInclude = commandParts[1];
                    if (text.contains(substringInclude)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "End":
                    //End {substring}"
                    String substringEnd = commandParts[1];
                    if (text.endsWith(substringEnd)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    text = text.toUpperCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                    //FindIndex {char}"
                    String charToFind = commandParts[1];
                    int index = text.indexOf(charToFind);
                    System.out.println(index);
                    break;
                case "Cut":
                    //Cut {startIndex} {count}"
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int count = Integer.parseInt(commandParts[2]);
                    String textLeft = text.substring(startIndex,startIndex + count);
                    System.out.println(textLeft);
                    break;
            }

            command = scanner.nextLine();
        }

    }
}
////Th1s 1s my str1ng!//
//Change 1 i
//Includes string
//End my
//Uppercase
//FindIndex I
//Cut 5 5
//Done
//output
////This is my string!//
//True
//False
////THIS IS MY STRING!//
//4
//S IS

//*S0ftUni is the B3St Plac3**
//Change 2 o
//Includes best
//End is
//Uppercase
//FindIndex P
//Cut 3 7
//Done
