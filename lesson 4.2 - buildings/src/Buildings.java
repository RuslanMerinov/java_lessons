import java.util.Scanner;

public class Buildings {

    public static void main(String[] args) {

        Scanner cScanner = new Scanner(System.in);

        System.out.println("Area Side 1:");
        int e = cScanner.nextInt();
        System.out.println("Area Side 2:");
        int f = cScanner.nextInt();
        System.out.println("Building 1 Side 1:");
        int a = cScanner.nextInt();
        System.out.println("Building 1 Side 2:");
        int b = cScanner.nextInt();
        System.out.println("Building 2 Side 1:");
        int c = cScanner.nextInt();
        System.out.println("Building 2 Side 2:");
        int d = cScanner.nextInt();

        if(
                        (e >= a && e >= c && f >= (b + d)) ||
                        (e >= b && e >= c && f >= (a + d)) ||
                        (e >= a && e >= d && f >= (b + c)) ||
                        (e >= b && e >= d && f >= (a + c)) ||
                        (f >= a && f >= c && e >= (b + d)) ||
                        (f >= b && f >= c && e >= (a + d)) ||
                        (f >= a && f >= d && e >= (b + c)) ||
                        (f >= b && f >= d && e >= (a + c)))
        {
            System.out.println("Yes, we can place these buildigs here.");
        } else {
            System.out.println("No, doesn't fit. Please try again.");
        }
    }
}
