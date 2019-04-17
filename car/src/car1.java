public class car1 {
    String name = "some car";
    String color = "black";
    int run = 0;
    boolean isBroken;

    car1 (int run) {
        this.run = run;
    }

car1 (String color) {
        this.color = color;
}

car1 () {}

public void runcar (int distance) {
        run += distance;
}
public void tobreak (String whatIsBroken) {
        isBroken = true;
    System.out.println("OMG! " + whatIsBroken + " is broken in " + name +"!");
}


}

