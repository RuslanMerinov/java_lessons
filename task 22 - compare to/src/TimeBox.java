public class TimeBox {

    int h;
    int min;
    int sec;
    int totalSec = 0;

    public TimeBox(int h, int min, int sec) {
        this.h = h;
        this.min = min;
        this.sec = sec;

    }

    public TimeBox(int totalSec) {
        this.totalSec = totalSec;
        this.sec = totalSec % 60;
        this.min = ((totalSec - this.sec) % 3600 / 60);
        this.h = totalSec / 3600;

    }

    int muchSeconds() {
        this.totalSec = this.sec + (this.min * 60) + (this.h * 3600);
        return this.totalSec;

    }


    @Override
    public String toString() {
        return "TimeBox {" + this.hashCode() + "} contains " +
                "hours: " + h +
                ", minutes: " + min +
                ", seconds: " + sec +
                ", total seconds: " + totalSec +
                '.';
    }

    void compare(TimeBox tc2) {

        if (this.totalSec == 0) this.totalSec = this.muchSeconds();
        if (tc2.totalSec == 0) tc2.totalSec = tc2.muchSeconds();

        System.out.printf("Now let's compare {" + this.hashCode() + "} and {" + tc2.hashCode() + "}, you see that ");

        if (this.totalSec == tc2.totalSec) {
            System.out.println("they are equal!");
        } else {
            if (this.totalSec > tc2.totalSec) {
                System.out.println("first one is " + (this.totalSec - tc2.totalSec) + " seconds more.");
            } else {
                System.out.println("first one is " + (tc2.totalSec - this.totalSec) + " seconds less.");

            }
        }


    }


}
