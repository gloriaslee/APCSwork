public class power{
  public static void main(String[]args){
    System.out.println(power(3,4));
  }
  public static double power(double x, int n){
    double result = x;
    int i=1;
    for(i=1; i<n+1; i++){
      result = result*x;
    }
    return result;
  }
}
