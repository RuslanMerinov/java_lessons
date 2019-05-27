package by.pvt.FilesFoldersThreads;

public class Main {

    public static void main(String[] args) {

        String directoryName = "C:\\Windows";

        FilesFolders filesFolders = new FilesFolders();
        filesFolders.FileList(directoryName);
        System.out.println("Looking at "+directoryName+"\n");

        Thread runnerThread1 = new Thread(new Runner(filesFolders), "Runner 1");
        Thread runnerThread2 = new Thread(new Runner(filesFolders), "Runner 2");
        Thread runnerThread3 = new Thread(new Runner(filesFolders), "Runner 3");
        Thread runnerThread4 = new Thread(new Runner(filesFolders), "Runner 4");
        Thread runnerThread5 = new Thread(new Runner(filesFolders), "Runner 5");
        Thread runnerThread6 = new Thread(new Runner(filesFolders), "Runner 6");
        Thread runnerThread7 = new Thread(new Runner(filesFolders), "Runner 7");
        Thread runnerThread8 = new Thread(new Runner(filesFolders), "Runner 8");
        Thread runnerThread9 = new Thread(new Runner(filesFolders), "Runner 9");
        Thread runnerThread10 = new Thread(new Runner(filesFolders), "Runner 0");

        runnerThread1.start();
        runnerThread2.start();
        runnerThread3.start();
        runnerThread4.start();
        runnerThread5.start();
        runnerThread6.start();
        runnerThread7.start();
        runnerThread8.start();
        runnerThread9.start();
        runnerThread10.start();
    }


}
