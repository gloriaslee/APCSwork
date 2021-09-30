public class Time{
  public static void main(String[]args){
    int ogHour = 22;
    int ogMinute = 31;
    int ogSecond = 8;
    int hour = 23;
    int minute = 1;
    int second = 42;
    int totalSecondsInDay = 24*60*60;
    int secsSinceMidnight = hour*60*60 + minute*60 + second;
    System.out.println(secsSinceMidnight+ " seconds since midnight.");
    int secondsRemaining = totalSecondsInDay - secsSinceMidnight;
    System.out.println(secondsRemaining+" seconds remaining in the day.");
    double secsSinceMidnight2 = secsSinceMidnight;
    double percentageOfDayPassed = secsSinceMidnight2/totalSecondsInDay;
    System.out.println(Math.round(percentageOfDayPassed*100)+"% of the day has passed");
    System.out.println(secsSinceMidnight-ogHour*60*60-ogMinute*60-ogSecond+"seconds passed since beginning work");
  }
}
