import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_MemoryGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            //a 2 4 a 2 4
        int moves = 0; // брояч на опити

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            int firstIndex = Integer.parseInt(input.split(" ")[0]);
            int secondIndex = Integer.parseInt(input.split(" ")[1]);
            moves++;

            boolean isValid = isValid(firstIndex, secondIndex, elements.size() - 1);
            if (!isValid) {
                //ако индексите не са валидни !!!
                //добавяме два елемента които трябва да са в този формат --> - <moves> a
                //String newElement = "-" + moves + "a";
                String newElement = String.format("-%da", moves); //String newElement = "-" + moves + "a";
                elements.add(elements.size() / 2, newElement); //в средата на списъка добавяме допълнителни елементи
                elements.add(elements.size() / 2, newElement);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                //ако индексите са валидни !!!
                String firstElement = elements.get(firstIndex);
                String secondElement = elements.get(secondIndex);

                if (firstElement.equals(secondElement)) {
                    //ако сме познали 2та еднакви елементи ги премахваме
                    elements.remove(firstElement);
                    elements.remove(secondElement);
                    System.out.printf("Congrats! You have found matching elements - %s!\n", firstElement);
                } else {
                    //ако не сме намерили две еднакви числа
                    System.out.println("Try again!");
                }
            }

            if (elements.isEmpty()) {
                //elements == 0
                //ако сме останали без елементи
                System.out.printf("You have won in %d turns!\n", moves);
                return;
            }

            input = scanner.nextLine();
        }


        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ", elements));
    }

    private static boolean isValid(int firstIndex, int secondIndex, int lastIndex) {
            // метод за валидиране на индекси !!!
        boolean areNotTheSameIndexes = firstIndex != secondIndex; //индексите не са еднакви
        boolean firstIndexInBounds = firstIndex >= 0 && firstIndex <= lastIndex;
        boolean secondIndexInBounds = secondIndex >= 0 && secondIndex <= lastIndex;

        return areNotTheSameIndexes && firstIndexInBounds && secondIndexInBounds;
        //само когато тези индекси са спазени условието е валидно
    }

}

//a 2 4 a 2 4
//0 3
//0 2
//0 1
//0 1
//end

//output
//Congrats! You have found matching elements - a!
//Congrats! You have found matching elements - 2!
//Congrats! You have found matching elements - 4!
//You have won in 3 turns!