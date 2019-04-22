import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("Give me the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;

        if((n % 2) == 0  && n > 2) {
            isPrime = false;}

        if (isPrime) {
            for (int i = 3; i <= n / i; i += 2) {
                if ((n % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
        }


        if (isPrime) System.out.println("It is Prime");
        else System.out.println("It is composite");

    }
}

