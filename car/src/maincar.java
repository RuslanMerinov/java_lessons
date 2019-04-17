 public class maincar {
    public static void main(String[] args) {

        car1 ferrari = new car1 (100);
        ferrari.name = "Ferraarri";

        ferrari.color = "red";
        System.out.println("Ferrari color is " + ferrari.color);

        car1 nissan = new car1("grey");
        nissan.name = "Nissan";

        System.out.println("Nissan color is " + nissan.color);
        System.out.println("Is nissan broken? - "+ nissan.isBroken);

        nissan.runcar(15);
        ferrari.runcar(-40);

        System.out.println("Nissan run " + nissan.run );
        System.out.println("Ferrari run " + ferrari.run);
        nissan.tobreak("Window");
        System.out.println("Is nissan broken? - "+ nissan.isBroken);
            }


}
