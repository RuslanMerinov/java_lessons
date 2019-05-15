package by.pvt.lessons.task30and31;
///Читаю из файла, записываю в другой файл, делаю то что надо в задании 30,
//потом то что надо в задании 31. Знаю, что не работает с кириллицей
//но хотелось FileReader, и почитал что это лечить непросто, надо явно указывать
//кодировку, другие методы не нравились, в общем получилось так
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilePunctuation {
    public static void main(String[] args) {

        String fileName = "MyAwesomeFile.txt";

        new File(fileName);

        StringBuffer s = new StringBuffer();

        try (BufferedReader br = new BufferedReader(new FileReader("joyce.txt"))) {

            while ((br.ready())) {
                s.append(br.readLine()).append(System.lineSeparator());
            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        System.out.println(s);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            bw.write(s.toString());
            bw.flush();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        String result = s.toString();
        Pattern p = Pattern.compile("\\p{Punct}");
        Matcher m = p.matcher(result);

        int n = 0;
        while (m.find()) {
            n++;
        }
        System.out.println(n + " punctuation symbols here.");

        String[] words = result.split(" ");
        System.out.println(words.length + " words here.\n");

        System.out.println("Digits here:");
        Pattern p1 = Pattern.compile("[0-9]+");
        Matcher m1 = p1.matcher(result);
        ArrayList <Integer> numbers = new ArrayList<>();
        n = 0;
        while (m1.find()) {
            System.out.print(m1.group()+ ", ");
            numbers.add(Integer.parseInt(m1.group()));
            n += Integer.parseInt(m1.group());
        }
        System.out.println();
        System.out.println("sum of them is "+n+".\n");

        System.out.println("Now removing duplicates, these numbers left:");
        Set <Integer> set = new HashSet <>(numbers);
        System.out.println(set.toString());



    }
}




