import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println("Give me the number:");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0;

        for(n = sc.nextInt(); n != 0; n /= 10)
        {
            sum += (n % 10);
        }
        System.out.println("The sum of this number's digits is " + sum);

    }
}
