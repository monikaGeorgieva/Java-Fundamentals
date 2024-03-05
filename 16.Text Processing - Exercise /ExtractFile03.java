import java.util.Scanner;

public class ExtractFile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String path = scanner.nextLine();
       // \ -- > \\
       String [] parts = path.split("\\\\");
       String fullNameFille = parts[parts.length - 1]; //Template.pptx

        //Template.pptx.split(".") -- > ["Template","pptx"]
        String name = fullNameFille.split("\\.")[0];
        String extension = fullNameFille.split("\\.")[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);
    }
}
//C:\Internal\training-internal\Template.pptx
//output
//File name: Template
//File extension: pptx
