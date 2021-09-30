import java.util.Scanner;

public class CheckDivisible{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    boolean divisible= isDivisible(in.nextInt(), in.nextInt());
    System.out.println(divisible);
  }

  public static boolean isDivisible(int m, int n){
    boolean divisible;
    if (m % n ==0) {
      divisible = true;
    } else{
      divisible = false;
    }
    return divisible;

  }
}
