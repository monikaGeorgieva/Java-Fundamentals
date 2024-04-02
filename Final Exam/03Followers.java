import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        //03. Followers
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> followerLikes = new LinkedHashMap<>();
        Map<String,Integer> followersComments = new LinkedHashMap<>();
        String commands = scanner.nextLine();
        while (!commands.equals("Log out")){
            String [] commandParts = commands.split(": ");
            String commandName = commandParts[0];
            String username = commandParts[1];
            switch (commandName){
                case "New follower":
                    //New follower: {username}"
                    if (!followerLikes.containsKey(username)){
                        followerLikes.put(username,0);
                    }else if (!followersComments.containsKey(username)){
                        followersComments.put(username,0);
                    }else {
                        break;
                    }
                    break;
                case "Like":
                    //Like: {username}: {count}":
                    int count = Integer.parseInt(commandParts[2]);
                    if (!followerLikes.containsKey(username)){
                        followerLikes.put(username,count);
                    }else{
                        int currentLikes = followerLikes.get(username);
                        followerLikes.put(username,currentLikes + count);
                    }
                    break;
                case "Comment":
                    if (!followersComments.containsKey(username)){
                        followersComments.put(username,1);
                    }else{
                        int currentCommnet = followersComments.get(username);
                        followersComments.put(username,currentCommnet + 1);
                    }
                    break;
                case "Blocked":
                    if (followerLikes.containsKey(username)){
                        followerLikes.remove(username);
                    } else if (followersComments.containsKey(username)) {
                        followersComments.remove(username);
                    } else{
                        System.out.printf("%s doesn't exist.\n",username);
                    }
                    break;
            }

            commands = scanner.nextLine();
        }
        System.out.printf("%d followers\n",followerLikes.size());
        //1 followers
        for (Map.Entry<String, Integer> entry : followerLikes.entrySet()) {
            String username = entry.getKey();
            int likes = entry.getValue();
            int total = 0;
            if (followersComments.get(username) == null){
                int comments = 0;
                total = likes + comments;
            }else {
                int comments = followersComments.get(username);
                total = likes + comments;
            }

            System.out.printf("%s: %d\n",username,total);
            //George: 5

        }

    }
}
//New follower: George
//Like: George: 5
//New follower: George
//Log out

//1 followers
//George: 5
