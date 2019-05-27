package by.pvt.FilesFoldersThreads;

public class Runner implements Runnable{
private FilesFolders folders;

    Runner(FilesFolders folders) {
        this.folders = folders;
    }

    @Override
    public void run() {
        try {
            folders.filesOut();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
