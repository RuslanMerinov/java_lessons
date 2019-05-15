package by.pvt.lessons.task33;

import java.io.File;

public class FilesFolders {
    public static void main(String[] args) {

        File folder = new File("C:\\Windows");
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {

            for (File listOfFile : listOfFiles) {
                if (listOfFile.isDirectory()) {
                    System.out.println("Directory " + listOfFile.getName());
                }
            }

            System.out.println();

            for (File listOfFile : listOfFiles) {
                if (listOfFile.isFile()) {
                    System.out.println("File " + listOfFile.getName());
                }
            }


        }
    }
}
