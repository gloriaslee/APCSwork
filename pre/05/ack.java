import java.util.Scanner;

public class ack{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println(ackermann(in.nextInt(), in.nextInt()));
  }

  public static int ackermann(int m, int n){
    if(m==0){
      return n+1;
    } else if(n==0){
      return ackermann(m-1, 1);
    } else{
      return ackermann(m-1,ackermann(m,n-1));
    }
  }
}
