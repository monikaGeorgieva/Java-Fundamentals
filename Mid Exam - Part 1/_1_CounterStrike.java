import java.util.Scanner;

public class _1_CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int win = 0;

        while (!command.equals("End of battle")){
            int distance = Integer.parseInt(command);
            if (distance <= initialEnergy){
                win++;
                initialEnergy -= distance;
                if (win % 3 == 0){
                    initialEnergy += win;
                }
            }else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy\n",win,initialEnergy);
                return;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d",win,initialEnergy);

    }
}
