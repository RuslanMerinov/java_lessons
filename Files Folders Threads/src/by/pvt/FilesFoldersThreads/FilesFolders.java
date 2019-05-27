package by.pvt.FilesFoldersThreads;

import java.io.File;
import java.util.ArrayList;


class FilesFolders {


    private final ArrayList<String> files = new ArrayList<>();
    private final ArrayList<String> directories = new ArrayList<>();

    void FileList(String directory) {

        File folder = new File(directory);
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {

            for (File listOfFile : listOfFiles) {

                if (listOfFile.isDirectory()) {
                    directories.add(listOfFile.getName());
                }
            }

            for (File listOfFile : listOfFiles) {

                if (listOfFile.isFile()) {
                    files.add(listOfFile.getName());
                }
            }
        }
    }

    void filesOut() throws InterruptedException {

        while (!directories.isEmpty()) {
            synchronized (directories) {
                if (!directories.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + " found Directory: " + directories.remove(0));
                    Thread.sleep(100);
                }
            }
        }

        while (!files.isEmpty()) {
            synchronized (files) {
                if (!files.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + " found file: " + files.remove(0));
                    Thread.sleep(100);
                }
            }
        }


    }


}