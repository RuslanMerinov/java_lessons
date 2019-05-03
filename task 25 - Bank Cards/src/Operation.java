import java.util.Scanner;

class Operation {

    void balanceInOut(boolean inout, VisaUnembossed v1, String where) {

        Scanner scan = new Scanner(System.in);
        System.out.println(v1);

        if (inout) {

            System.out.println("Let me in:");
            v1.income(scan.nextInt());

        } else {
            if (v1 instanceof VisaClassic && where == "abroad") {
                System.out.println("Let me out a lot: ");
                ((VisaClassic) v1).payAbroad(scan.nextInt());
            } else
            {System.out.println("Let me out: ");
            v1.outcome(scan.nextInt());}

        }
        System.out.println(v1);
    }


}
