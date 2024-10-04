//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SecondsCounter {
    public static void main(String[] args) {
        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        long secondsInYear = daysInYear * hoursInDay * minutesInHour * secondsInMinute;
        System.out.println("There are " + secondsInYear + " seconds in a year.");
        }
    }
