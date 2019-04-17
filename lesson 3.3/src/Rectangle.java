import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner cScanner = new Scanner(System.in);

        System.out.println("Rectangle side 1:");
                int  a = cScanner.nextInt();

        System.out.println("Rectangle side 2:");
                int  b = cScanner.nextInt();

        System.out.println("Circle radius:");
                int  r = cScanner.nextInt();

        if (r * r >= (a * a + b * b) / 4)
        { System.out.println("Yes We Can!");}
        else
        {  System.out.println("No, this circle is too small");}
    }
}
