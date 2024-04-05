
import java.util.*;
import java.util.stream.Collectors;

public class _1_Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String,String> contestAndPassword = new LinkedHashMap<>();
        while (!input.equals("end of contests")){
            String [] inputParts = input.split(":");
            String contest = inputParts[0];
            String password = inputParts[1];
            contestAndPassword.put(contest,password);
            input = scanner.nextLine();
        }

        //C# Fundamentals=>fundPass=>Tanya=>350
        //{contest}=>{password}=>{username}=>{points}
        String text = scanner.nextLine();
        Map<String, Map<String, Integer>> students = new TreeMap<>();
        while (!text.equals("end of submissions")){
            String [] textParts = text.split("=>");
            String contest = textParts[0];
            String password = textParts[1];
            String username = textParts[2];
            int points = Integer.parseInt(textParts[3]);

            if (contestAndPassword.containsKey(contest)){
                if (contestAndPassword.get(contest).equals(password)){
                    if (!students.containsKey(username)){
                        students.put(username,new LinkedHashMap<>());
                    }
                    if(!students.get(username).containsKey(contest)){
                        Map<String, Integer> result = students.get(username);
                        result.put(contest, points);
                        students.put(username, result);
                    }else{
                        int currentPoints = students.get(username).get(contest);
                        if(currentPoints < points) {
                            Map<String, Integer> result = students.get(username);
                            result.put(contest, points);
                            students.put(username, result);
                        }
                    }
                }
            }

            text = scanner.nextLine();
        }
        // Sort
        Map<String, Integer> scores = students.entrySet().stream().map(e -> {
            String nameKey = e.getKey();
            int allPointsValue = e.getValue().values().stream().mapToInt(Integer::intValue).sum();
            return (Map.Entry<String, Integer>) new AbstractMap.SimpleEntry<>(nameKey, allPointsValue);
        }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Sort
        Optional<Map.Entry<String, Integer>> first = scores.entrySet().stream().min((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Print result
        System.out.printf("Best candidate is %s with total %d points.%n", first.get().getKey(), first.get().getValue());
        System.out.println("Ranking:");

        System.out.println(students.entrySet().stream()
                .map(e -> String.format("%s%n%s", e.getKey(), e.getValue().entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).map(element -> String.format("#  %s -> %d", element.getKey(), element.getValue())).collect(Collectors.joining("\n")))).collect(Collectors.joining("\n")));
        scanner.close();
    }
}


//Part One Interview:success
//Js Fundamentals:Pesho
//C# Fundamentals:fundPass
//Algorithms:fun
//end of contests
//C# Fundamentals=>fundPass=>Tanya=>350
//Algorithms=>fun=>Tanya=>380
//Part One Interview=>success=>Nikola=>120
//Java Basics Exam=>pesho=>Petkan=>400
//Part One Interview=>success=>Tanya=>220
//OOP Advanced=>password123=>BaiIvan=>231
//C# Fundamentals=>fundPass=>Tanya=>250
//C# Fundamentals=>fundPass=>Nikola=>200
//Js Fundamentals=>Pesho=>Tanya=>400
//end of submissions
