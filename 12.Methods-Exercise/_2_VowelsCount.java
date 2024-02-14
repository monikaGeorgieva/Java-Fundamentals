import java.util.Scanner;

public class _2_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().toLowerCase();
        int countVowels = getVowelsCount(string);
        System.out.println(countVowels);
    }

   public static int getVowelsCount(String string){
          int countVowes = 0;
       for (char letter : string.toCharArray()) {
           if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
               countVowes++;
           }
       }
        return countVowes;
   }
}
//monika
//3