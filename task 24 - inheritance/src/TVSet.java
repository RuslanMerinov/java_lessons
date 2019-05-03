public class TVSet extends Monitor implements Pluggable {

    int tvPrograms = 100;

    public TVSet(String name, String color) {
        super(name, color);
    }

    @Override
    public String toString() {
        return "TVSet {" +
                "tvPrograms=" + tvPrograms +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

