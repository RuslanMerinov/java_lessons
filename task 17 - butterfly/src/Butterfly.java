
import java.util.Scanner;

// впервые написал код, который сам не понял как написал

public class Butterfly {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter array dimension:");
        int x = Sc.nextInt();

        System.out.println("Check out a butterfly:");

        int[][] myArray = new int[x][x];
        int i, z;
        int min = 0;
        int max;
        max = x-1;

        for (i = 0; i <= x/2; i++) {
            for (z = 0; z <= x - 1; z++) {
                if (z >= min & z <= max) myArray[i][z] = 0;
                else myArray[i][z] = 1;
            }
            min += 1;
            if (max-min<1) max=x-min; else max -=1;
        }

        if (x%2 == 0) {min=x/2-1;max=x/2;} else min=max=x/2;

        for (i = x/2; i < x; i++) {
            for (z = 0; z <= x - 1; z++) {
                if (z >= min & z <= max) myArray[i][z] = 0;
                else myArray[i][z] = 1;
            }
            min -= 1;
            if (max - min < 1) max = x - min;
            else max += 1;
        }

        for (int[] row : myArray) {
            printRow(row);

        }
    }

    private  static void printRow(int[] row) {
        for (int i : row) {
            System.out.print(i);
           System.out.print("\t");
        }
       System.out.println();
    }
}