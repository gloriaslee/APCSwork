import java.util.Scanner;

public class Even{
  public static boolean even(int x){
    if(x%2 == 0){
      return true;
    } else{
      return false;
    }
  }

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int integer = in.nextInt();
    System.out.println(even(integer));
    
  }
}
