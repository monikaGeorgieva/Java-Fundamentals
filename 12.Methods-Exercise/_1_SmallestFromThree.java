import java.util.Scanner;

public class _1_SmallestFromThree {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int first = Integer.parseInt(scanner.nextLine());
      int second = Integer.parseInt(scanner.nextLine());
      int third = Integer.parseInt(scanner.nextLine());

      findMin(first,second,third);

    }
    public static void findMin(int first,int second,int third){
        System.out.println(Math.min(Math.min(first, second), third));
    }
}
//25
//-21
//4
//output
//-21
