public class Smartphone extends Laptop implements Pluggable {

    int weight = 70;

    public Smartphone(String name, String color, int weight) {
        super(name, color);
        this.weight = weight;
    }

    @Override
    public void plugin(String name) {
        this.name = name;
        System.out.println(name+ " is turned on!");
    }

    @Override
    public String toString() {
        return "Smartphone {" + name + " " +
                "weight=" + weight +
                '}' + " resolution "+ getResolution();
    }
}
