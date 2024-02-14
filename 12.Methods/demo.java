import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        sayHello(firstName,age);
    }
   public static void sayHello(String name,int age){
//       System.out.printf("Hello ,%s\n",name);
//       System.out.printf("I'm %d years old.",age);

       String result =  String.format("Hello my name is %s. I'm %d years old.",name,age);
       System.out.println(result);
    }
}
