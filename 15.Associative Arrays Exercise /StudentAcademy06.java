import java.util.*;

public class StudentAcademy06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //студент -> списък от оценките
        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            //има такъв студент
            if (studentGrades.containsKey(studentName)){
                List<Double> currentGrades = studentGrades.get(studentName);
                currentGrades.add(grade);
            }else {
                //няма такъв студент
                //добави студента,със празен списък
                studentGrades.put(studentName,new ArrayList<>());
                //срещу списъка с името добави оценката
                studentGrades.get(studentName).add(grade);

            }
        }
        //студент -> ср. оценка
        //"Ivan" - > {4;5,6}
        Map <String,Double> studentAverageGrade = new LinkedHashMap<>();
        //студенти със средна оценка
        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);
            if (averageGrade >= 4.50){
                studentAverageGrade.put(studentName,averageGrade);
            }
        }

        studentAverageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f\n",entry.getKey(),entry.getValue()));

    }

    private static double getAverageGrade(List<Double> grades) {
        double sum = 0;
        for (double grade: grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
//5
//John
//5.5
//John
//4.5
//Alice
//6
//Alice
//3
//George
//5
