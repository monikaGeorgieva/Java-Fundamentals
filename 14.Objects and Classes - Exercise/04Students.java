import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            //"Lakia Eason 3.90"
            String firstName = input.split(" ")[0];
            String lastName = input.split(" ")[1];
            double grade = Double.parseDouble(input.split(" ")[2]);

            //конструиране на обект student на класа Student
            Student student = new Student(firstName,lastName,grade);
            students.add(student);
        }
        //сравнява и подрежда по техните оценки
        students.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student: students) {
            System.out.printf("%s %s: %.2f \n",student.getFirstName(),student.getLastName(),student.getGrade());
        }
    }
}
class Student {
    //1.Fields
    private String firstName;
    private String lastName;
    private double grade;

    //2.Constructor
    public Student(String firstName, String lastName, double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    //3.Methods getFirstName,getLast.. методи за връщане на стойност
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public double getGrade(){
        return this.grade;
    }
}
