public class Monitor {
    String name = "Philips";
    String color = "white";
    private int resolution = 720;

    public Monitor(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Monitor {" +
                "color='" + color + '\'' +
                ", resolution= " + resolution +
                '}';
    }

    protected int getResolution() {
        return resolution;
    }

    protected void setResolution(int resolution) {
        this.resolution = resolution;


    }
}
