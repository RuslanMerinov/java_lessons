public class Laptop extends TVSet implements Pluggable {

    boolean isPlugged = false;
    private int  memory = 16;

    public Laptop(String name, String color) {
        super(name, color);
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "memory=" + memory +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", resolution  " + getResolution() +
                '}';
    }

    @Override
    public void plugin(String name) {
        this.name = name;
        isPlugged = true;
        System.out.println("Windows is starting!..");
    }
}
