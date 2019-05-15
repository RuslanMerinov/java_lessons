package by.pvt.lessons.task32;

import java.io.*;

public class Stream {

    public static void main(String[] args) throws IOException {
        int n;
        int nn = 20;
        try (DataOutputStream dataOutputStream = new DataOutputStream
                (new BufferedOutputStream(new FileOutputStream("numbers.dat")))) {
            for (int i = 0; i < nn; i++) {
                n = (int) Math.round(Math.random() * 100);
                dataOutputStream.writeInt(n);
            }
            dataOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        DataInputStream dataInputStream = new DataInputStream(
                new BufferedInputStream(new FileInputStream("numbers.dat")));

        int num = n = dataInputStream.readInt();

        while (true) {

            try {
                System.out.print(num + "  ");
                num = dataInputStream.readInt();
                n += num;
            } catch (EOFException e) {
                break;
            }
        }
        dataInputStream.close();
        System.out.println("\nAverage " + n / nn);
    }
}
