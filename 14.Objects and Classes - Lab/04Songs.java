import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //логиката на задачата -> входни данни, алгоритми

        Scanner scanner = new Scanner(System.in);

        int countSongs = Integer.parseInt(scanner.nextLine()); //брой песни
        List<Song> songsList = new ArrayList<>();


        for (int count = 1; count <= countSongs ; count++) {
            String data = scanner.nextLine();
            String [] songData = data.split("_");
            String typeList = songData[0];
            String name = songData[1];
            String time = songData[2];

            //песен
            Song song = new Song(typeList, name, time);

            //добавям песента към списъка с въведени песни
            songsList.add(song);

        }
        //пълен списък с въведените песни
        //1. all -- > имената на всички песни
        //2. име на плейлиста -> имената на всички песни в плейлиста
        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song song : songsList) {
                System.out.println(song.getName());
            }
        }else {
            //command e име на плейлиста
            for (Song song: songsList) {
                if (song.getTypeList().equals(command)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
class Song {
    //характеристики (field): Type List, Name and Time (3:23)
    private  String typeList;
    private String name;
    private String time;

    //конструктор --> създава обект от класа
    public Song (String typeList,String name,String time){
        //нов празен обект
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }
    //getter  за полето name
    public String getName(){
        return name;
    }
    public String getTypeList(){
        return typeList;
    }
}
