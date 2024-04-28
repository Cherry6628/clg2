import java.io.File;
import java.util.Scanner;
public class FileDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the path of the file:");
        String filePath = input.nextLine();
        File file = new File(filePath);
        
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Path: " + file.getPath());
            System.out.println("Abs Path: " + file.getAbsolutePath());
            System.out.println("Parent: " + file.getParent());
            System.out.println("This file is: " + (file.exists() ? "Exists" : "Does not exist"));
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is Readable: " + file.canRead());
            System.out.println("IS Writable: " + file.canWrite());
            System.out.println("Is Absolute: " + file.isAbsolute());
            System.out.println("File Last Modified: " + file.lastModified());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Is Hidden: " + file.isHidden());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
