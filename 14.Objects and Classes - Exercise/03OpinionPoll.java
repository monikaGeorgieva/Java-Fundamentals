import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        int countPeople = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countPeople ; i++) {
            //"{name} {age}"
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);

            Person person = new Person(name,age);
            if (age > 30){
                people.add(person); //във списъка с хора добавяме обект
            }
        }
        for (Person person : people) { //от списъка с хора -- > Person
            System.out.printf("%s - %d\n",person.getName(),person.getAge());
        }
    }
}
class Person {


   private String name;
   private int age;

   public Person (String name,int age){
       this.name = name;
       this.age = age;
   }
   //methods
   public String getName(){
       return this.name;
   }
   public int getAge(){
       return this.age;
   }
}
