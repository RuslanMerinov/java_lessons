import java.util.Scanner;

public class BuhFormat {

    public static void main(String[] args) {

        System.out.println("Give me the number:");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        String convert = Long.toString(n);
        char[] stringToCharArray = convert.toCharArray();

        String result = "";

        int howLong = stringToCharArray.length-1;
        int z=3;
        while (howLong>=0) {

        if (z!=0) {result = stringToCharArray[howLong] + result;}
        else {result = stringToCharArray[howLong] +" "+ result; z=3;}
                    z--;
                    howLong--;
        }
        System.out.println("Look, now it's better to read -> "+result);
        //System.out.printf("%,d", n);
    }
}
