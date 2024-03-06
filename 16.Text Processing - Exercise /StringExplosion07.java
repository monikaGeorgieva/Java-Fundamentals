import java.util.Scanner;

public class StringExplosion07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //abv>1>1>2>2asdasd
        StringBuilder textBuilder = new StringBuilder(input); //abv>1>1>2>2asdasd

        int totalStrenght = 0; //обща сила
        for (int position = 0; position <= textBuilder.length() - 1 ; position++) {
            char currentSymbol = textBuilder.charAt(position);

            if (currentSymbol == '>'){
                //експлозия
                //char '1' --> String "1" --> int 1
                int explosionStrength = Integer.parseInt(textBuilder.charAt(position + 1) + "");
                totalStrenght += explosionStrength;
            }else if (currentSymbol != '>' && totalStrenght > 0){
                //премахвам съответния елемент
                textBuilder.deleteCharAt(position);
                totalStrenght--;
                position--; //да се мине отново през текущата позиция
            }
        }
        System.out.println(textBuilder);
    }
}
//abv>1>1>2>2asdasd
//output:
//abv>>>>dasd

