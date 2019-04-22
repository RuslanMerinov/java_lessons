import java.lang.reflect.Array;
import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        double[] RandomArray;
        RandomArray = new double[10];
        int i = 0;
        for (i=0; i<10; i++) {
            RandomArray[i] = Math.round(Math.random()*100);
        }
        System.out.println("We have an array");
        System.out.println(Arrays.toString(RandomArray));
        Arrays.sort(RandomArray);
        System.out.println("and the biggest number here is "+RandomArray[9]);
    }
}
