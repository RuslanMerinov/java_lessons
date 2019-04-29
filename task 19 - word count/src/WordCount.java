import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = Sc.nextLine();


        Pattern p = Pattern.compile("\\S+");
        Matcher m = p.matcher(input);

        int n=0;
        while (m.find())
        {
          n++;
        }

        System.out.println(n+" words here");



    }

}
