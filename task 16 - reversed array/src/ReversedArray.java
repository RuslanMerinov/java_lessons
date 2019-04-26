import java.util.*;

public class ReversedArray {

    public static void main(String[] args) {

Scanner Sc = new Scanner(System.in);

        int arraySize = 0;
        System.out.println("Enter array size:");
        arraySize = Sc.nextInt();

int[] myArray;
myArray = new int[arraySize];
Random random = new Random();

for (int i=arraySize-1;i>0;i--) {
myArray[i] = random.nextInt(100);
                                }
        System.out.println("Straight: "+Arrays.toString(myArray));

int halfSize = arraySize/2;
int z;

for (int i=0; i !=halfSize; i++) {
    z=myArray[i];
    myArray[i]=myArray[--arraySize];
    myArray[arraySize]=z;

}
System.out.println("Reversed: " +Arrays.toString(myArray));
    }
}
