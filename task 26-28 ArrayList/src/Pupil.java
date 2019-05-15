public class Pupil {
    String name = "";
    int rating = 0;

    public Pupil(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}'+"\n";
    }
}
