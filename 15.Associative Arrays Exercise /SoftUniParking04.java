import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class SoftUniParking04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());
        Map<String,String> parkingData = new LinkedHashMap<>();

        for (int count = 1; count <= countCommands ; count++) {
            String command = scanner.nextLine();
            //1.register - command {username} {lisencePlateNumber}
            //2.unregiste - command {username}
            String [] commandParts = command.split(" ");
            //commandParts = ["register" "{username}" "{lisencePlateNumber}"]
            //commandParts = ["unregister" "{username}"]
            String commandName = commandParts[0]; // register or unregister
            String username = commandParts[1];

            switch (commandName){
                case "register":
                    String carNumber = commandParts[2]; //номер на колата
                    //1. имаме такъе собственик
                    if (parkingData.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s\n",carNumber);
                    }else {
                        parkingData.put(username,carNumber);
                        System.out.printf("%s registered %s successfully\n",username,carNumber);
                    }
                    //2. нямаме такъв собственик
                    break;
                case "unregister":
                    if (parkingData.containsKey(username)){
                        parkingData.remove(username);
                        System.out.printf("%s unregistered successfully\n",username);
                    }else {
                        System.out.printf("ERROR: user %s not found\n",username);
                    }
                    break;
            }
        }
        //map: собственик --> номер на колата
        //1ви начин:
       // parkingData.forEach((key,value) -> System.out.println(key + " => " + value));

        parkingData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
/*
5
register John CS1234JS
register George JAVA123S
register Andy AB4142CD
register Jesica VR1223EE
unregister Andy

output
John registered CS1234JS successfully
George registered JAVA123S successfully
Andy registered AB4142CD successfully
Jesica registered VR1223EE successfully
Andy unregistered successfully
John=>CS1234JS
George=>JAVA123S
Jesica=>VR1223EE
*/

