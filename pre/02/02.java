public class Date{
  public static void main(String[] args){
    String day = "Thursday";
    int date = 9;
    String month = "September";
    int year = 2021;
    System.out.println(day);
    System.out.println(date);
    System.out.println(month);
    System.out.println(year);
    System.out.println("American Format:");
    System.out.println(day+", "+month+" "+date+", "+year);
    System.out.println("European Format:");
    System.out.println(day+" "+date+" "+month+" "+year);
  }
}

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

import java.util.Scanner;

public class CtoF{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    double celsius = in.nextDouble();
    System.out.print(celsius+" degrees in Celcius are ");
    double fahrenheit = celsius*9/5+32;
    System.out.printf("%.1f", fahrenheit);
    System.out.println(" degrees in Fahrenheit.");
  }
}
