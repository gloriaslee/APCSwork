import java.lang.Math;

public class Quadratic{
  public static double determinant(double a, double b, double c){
    double determinant = (b*b -4*a*c);
    return determinant;
  }

  public static double quadraticPos(double a, double b, double c){
    double result = (-b+Math.sqrt(b*b -4*a*c))/(2*a);
    return result;
  }

  public static double quadraticNeg(double a, double b, double c){
    double result = (-b-Math.sqrt(b*b -4*a*c))/(2*a);
    return result;
  }

  public static void main(String[] args){
    double determinant = determinant(1,5,1);
    if(determinant <0){
      System.out.println("Only imaginary roots");
    } else if(determinant == 0){
      System.out.println(quadraticNeg(1,5,1));
    } else{
      System.out.println(quadraticNeg(1,5,1));
      System.out.println(quadraticPos(1,5,1));
    }


  }
}
