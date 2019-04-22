import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        double i = 2;
        double fact = 1;

        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        if (n==1) i=1;
        if (n==0) i=0;

        while (i <= n) {

            fact *= i;
            i++;

        }
        System.out.println("Factorial is " + fact);
    }
}
