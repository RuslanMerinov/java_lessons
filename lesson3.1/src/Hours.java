public class Hours {
    public static void main(String[] args) {

        int s = 694861;
        int sec;
        int m;
        int min, h;
        int days, weeks, mdays, mweeks;


        sec = s % 60;
        m = (s -sec) / 60;
        min = m % 60;
        h = (m -min) / 60;
        mdays = h % 24;
        days = (h -mdays) / 24;
        mweeks = days % 7;
        weeks = (days -mweeks) / 7;



        System.out.println(weeks + " недель " + mweeks + " дней " + mdays + " часов " + min + " минут " + sec + " секунд");
    }
}
