import java.util.*;

public class ForceBook09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //отбор -> списък с играчи
        Map<String, List<String>> teams  = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")){
            if (input.contains(" | ")){
                //input = {force_side} | {force_user}
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];

                //проверка за отбора
                //1.имаме такъв отбор
                if (!teams.containsKey(team)){
                    teams.put(team,new ArrayList<>());
                }
                //2.нямаме такъв отбор
                //добавяме играча към отбора ,ако го няма в друг отбор
                boolean isExist = false; //играча го има в друг отбор
                //isExist = true -> има го в друг отбор
                //isExst = false ->няма го в друг отбор
                for (List<String> list : teams.values()) {
                    if (list.contains(player)){
                        isExist = true;
                        break;
                    }
                }
                if (!isExist){
                    teams.get(team).add(player);
                }

            } else if (input.contains(" -> ")) {
                //input = {force_user} -> {force_side}
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];
                //премахваме играча ако има в някой отбор
                teams.entrySet().forEach(entryTeam -> entryTeam.getValue().remove(player));

                //преместване в нович отбор
                if (!teams.containsKey(team)){
                    teams.put(team,new ArrayList<>());
                    teams.get(team).add(player);
                }else {
                    teams.get(team).add(player);
                }
                System.out.printf("%s joins the %s side!\n",player,team);
            }

            input = scanner.nextLine();
        }
            //print
        //премахваме отборите без играчи
        teams.entrySet().stream().filter(teamEntry -> teamEntry.getValue().size() > 0)
        //оставяме само тези записи, които отговарят на условието
                .forEach(entry ->{
                    //entry: key(team) ->value (list of players)
                    //Side: {forceSide},Members: {forceUsers.Count}
                    System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}
