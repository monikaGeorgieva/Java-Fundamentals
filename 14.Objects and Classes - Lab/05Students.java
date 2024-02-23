import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students> students = new ArrayList<>();
        String line = scanner.nextLine();

        while (!line.equals("end")){
            String[] tokens = line.split(" ");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            Students student = new Students(firstName,lastName,age,city);

            students.add(student);
            line = scanner.nextLine();
        }
        String filterCity = scanner.nextLine();
        for (Students student: students) {
            if (student.getCity().equals(filterCity)){
                System.out.printf("%s %s is %d years old\n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }
    }
}
class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    //Generate constructor in class Student: ALT + INSERT
    public Students(String firstName,String lastName,int age,String city){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }
}
