import java.util.Scanner;

public class date {


    public static void main(String[] args) {
        int day = 0, month = 0, year = 0;
        boolean correct = true;

        while (correct) {

            Scanner cScanner = new Scanner(System.in);
            System.out.println("Enter day:");
            int inDay = cScanner.nextInt();
            System.out.println("Enter month:");
            int inMonth = cScanner.nextInt();
            System.out.println("Enter year:");
            int inYear = cScanner.nextInt();

            if (inMonth < 1 || inMonth > 12) correct = false;

            if (inMonth == 12 && inDay == 31) {
                year = inYear + 1;
            } else {
                year = inYear;
            }

            int switchMonth = 1;
            if (inMonth == 1 || inMonth == 3 || inMonth == 5 || inMonth == 7 || inMonth == 8 || inMonth == 10) {
                switchMonth = 31;
            } else {
                switchMonth = 30;
            }
            if (inMonth == 2) switchMonth = 28;
            if (inMonth == 12) switchMonth = 12;


            switch (switchMonth) {
                case 31: {
                    if (inDay < 1 || inDay > 31) correct = false;
                    if (inDay == 31) {
                        day = 1;
                        month = inMonth + 1;
                    } else {
                        day = inDay + 1;
                        month = inMonth;
                    }
                    break;
                }
                case 30: {
                    if (inDay < 1 || inDay > 30) correct = false;
                    if (inDay == 30) {
                        day = 1;
                        month = inMonth + 1;
                    } else {
                        day = inDay + 1;
                        month = inMonth;
                    }
                    break;
                }
                case 28: {
                    if (inDay < 1 ) correct = false;
                    if (inDay > 29 && isLeapYear(inYear)) correct = false;
                    if (inDay > 28 && !isLeapYear(inYear)) correct = false;
                    if ((inDay == 28 && !isLeapYear(inYear)) || (inDay == 29 && isLeapYear(inYear))) {
                        day = 1;
                        month = inMonth + 1;
                    } else {
                        day = inDay + 1;
                        month = inMonth;
                    }
                    break;
                }
                case 12: {
                    if (inDay == 31) {
                        day = 1;
                        month = 1;
                    } else {
                        day = inDay + 1;
                        month = inMonth;
                    }
                    break;
                }

            }
            System.out.println("Next day is " + day + "." + month + "." + year);


        }
        System.out.println("no such date, goodbye");
    }


    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
