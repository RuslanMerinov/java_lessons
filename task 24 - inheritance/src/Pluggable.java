public interface Pluggable {

    default void plugin(String name) {

        System.out.println(name+ " plugged in!");


    }
}
