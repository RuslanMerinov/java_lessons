import java.util.*;

public class Main {

    public static void main(String[] args) {

        int i;
        Pupil randomPupil;

        ArrayList<Pupil> pupils = new ArrayList<>();
        ArrayList<Pupil> bestpupils = new ArrayList<>();

        for (i = 0; i < 21; i++) {
            String name = "Pupil " + Integer.toString(i);
            pupils.add(new Pupil(name, (int) Math.round(Math.random() * 100)));
        }

        System.out.println("-- The list of " + pupils.size() + " --\n");
        pupils.forEach(n -> System.out.println(n));

        Iterator iterator1 = pupils.iterator();
        while (iterator1.hasNext()) {
            randomPupil = (Pupil) iterator1.next();
            if (randomPupil.rating < 30) iterator1.remove();
        }

        System.out.println("-- Worst removed -- " + pupils.size() + " left --\n");

        pupils.forEach(n -> System.out.println(n));

        bestpupils.add(pupils.get(0));

        for (i = 1; i < pupils.size(); i++) {
            randomPupil = pupils.get(i);
            if (randomPupil.rating > bestpupils.get(0).rating) {

                bestpupils.clear();
                bestpupils.add(randomPupil);

            } else {
                if (randomPupil.rating == bestpupils.get(0).rating) {
                    bestpupils.add(randomPupil);
                }
            }


        }
        System.out.println("-- Here's the best -- " + bestpupils.size() + " left --\n");

        bestpupils.forEach(n -> System.out.println(n));

    }
}

