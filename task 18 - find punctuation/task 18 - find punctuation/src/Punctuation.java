import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//посчитать количество знаков пунктуации в тексте

public class Punctuation {

    public static void main(String[] args) {

      Scanner Sc = new Scanner(System.in);
      System.out.println("Enter text:");
      String input = Sc.nextLine();


        Pattern p = Pattern.compile("[^A-Za-z0-9\\p{InCyrillic}]");
        Matcher m = p.matcher(input);

        int n=0;
        while (m.find())
        {
             if (!m.group().equals(" ")) {n++;}

        }

        System.out.println(n+" punctuation symbols here");



    }
}
