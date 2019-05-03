

public class Main {



    public static void main(String[] args) {

        Operation op = new Operation();

        VisaUnembossed visa1 = new VisaUnembossed(2343, 10);
        VisaClassic visa2 = new VisaClassic(5566, 10000, "Jimmy");


        op.balanceInOut(true, visa1, "yt");
        op.balanceInOut(false, visa2, "gf");

        System.out.println("\n----- moving to Poland ------\n");

        op.balanceInOut(false, visa2, "abroad");

        System.out.println("\n // Visa Unembossed serial " + visa1.getSerial());
        System.out.println(" // Visa Classic serial " + visa2.getSerial()+"\n");

        VisaGold visa3 = new VisaGold(6675, 1000000,"Kolya", "free Coca-Cola");
        System.out.println(visa3);

    }


}
