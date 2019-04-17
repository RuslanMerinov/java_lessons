import java.util.Scanner;

public class NumberSeven {

    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        String number1 = consoleScanner.nextLine();

        int num1 = Integer.parseInt(number1);
        int num2 = num1%10;

        if (num2 == 7) { System.out.println("We have Seven in the end!"); }
        else {System.out.println("Last number is Not Seven :(");}
    }
}

