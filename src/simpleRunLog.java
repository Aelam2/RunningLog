import java.util.Date;
import java.util.Scanner;

public class simpleRunLog {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        dayLog currentDay = new dayLog(null,"",
                0, 0);
        updateDayInfo(currentDay);
        currentDay.totalDayInfo();


    }

    public static void updateDayInfo(dayLog currentDay){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the current date? (MM-DD-YYYY)");

        String newDate = scan.next();
        String monthString = newDate.substring(0,2);
        int month = Integer.parseInt(monthString);
        String dayString = newDate.substring(3,5);
        int day = Integer.parseInt(dayString);
        String yearString = newDate.substring(6,10);
        int year = Integer.parseInt(yearString);

        Date currentDate = new Date(year, month, day);
        System.out.println(month);
        System.out.println(day);
        System.out.println(year);
        System.out.println(currentDate);
        currentDay.updateDate(currentDate);


        System.out.println("Type of Run?");
        currentDay.updateRunType(scan.next());

        System.out.println("Total Mileage?");
        currentDay.updateTotalMileage(scan.nextDouble());

        System.out.println("Total Elapsed Time?");
        currentDay.updateTotalTime(scan.nextInt());
    }

}
