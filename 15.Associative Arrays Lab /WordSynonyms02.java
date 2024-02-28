import java.util.*;

public class WordSynonyms02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!wordsMap.containsKey(word)){
                wordsMap.put(word, new ArrayList<>());
            }
            wordsMap.get(word).add(synonym); //добавям синонима
        }
        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            String keyMap = entry.getKey();
            ArrayList<String> synonymsList = entry.getValue();

            System.out.printf("%s - %s\n",keyMap,String.join(", ",synonymsList));
        }

        //{word} - {synonym1, synonym2… synonymN}
    }
}
//3
//cute
//adorable
//cute
//charming
//smart
//clever

//output
//cute - adorable, charming
//smart - clever
