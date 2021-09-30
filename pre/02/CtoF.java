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
