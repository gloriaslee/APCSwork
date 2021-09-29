```javascript
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
public static boolean(int a, int b, int c){
  boolean Triangle
  if(a+b>c && a+c>b && b+c>a){
    Triangle = true;
  } else{
    Triangle = false;
  }
  return Triangle;
}
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
```
