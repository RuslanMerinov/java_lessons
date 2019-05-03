

public class Main {


    public static void main(String[] args) {

        Smartphone apple = new Smartphone("Apple", "white", 48);
        Laptop dell = new Laptop("Dell", "Black");
        TVSet sony = new TVSet("Sony", "Silver");
        Monitor philips = new Monitor("Philips", "white");


        sony.plugin(sony.name);
        System.out.println(sony);
        apple.plugin("Iphone X");
        System.out.println(apple);
        printall();

        System.out.println(dell);
        dell.setMemory(64);
        dell.setResolution(1080);
        dell.plugin("DDDeeelll");
        System.out.println(dell.isPlugged);
        System.out.println(dell);
    }

    private static void printall () {

        // почему я не могу здесь распечатать все классы?
      //  System.out.println(apple.toString());
      //  System.out.println(new Monitor("LG", "Red"));


    }
}
