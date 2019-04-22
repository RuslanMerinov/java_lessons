import java.util.Arrays;


public class ArraySum {
    public static void main(String[] args) {
        int[] RandomArray;
        RandomArray = new int[10];
        int i = 0;
        int sum = 0;
        for (i=0; i<10; i++) {
            RandomArray[i] = (int) Math.round(Math.random()*1000);
        }
        System.out.println("We have an array");
        System.out.println(Arrays.toString(RandomArray));
        System.out.println("Processing...");

        Arrays.sort(RandomArray);
        for (i=1; i<9; i++) {
            sum += RandomArray [i];
            System.out.println(RandomArray[i]);
        }
        System.out.println("The sum of this array elements without biggest and smallest number is "+sum);
    }

}
