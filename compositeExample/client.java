import java.io.File;

/**
 * client
 */
public class client {

     public static void main(String[] args) {
        file file1 = new file("Document.txt", "100");
        file file2 = new file("Image.jpg", "10");
        file file3 = new file("Spreadsheet.xlsx", "1000");

        directory directory1 = new directory("Documents");
        directory1.addComponent(file1);
        directory1.addComponent(file3);

        directory directory2 = new directory("Pictures");
        directory2.addComponent(file2);

        directory rootDirectory = new directory("Root");
        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(directory2);

        rootDirectory.displayDetails();
    }
}