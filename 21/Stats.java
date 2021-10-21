

public class Stats {

  public static int mean(int a, int b) {
    int mean;
    mean = (a + b)/2;
    return mean;

  }
    
   public static double mean(double a, double b) {
     double mean; 
     mean = a/2 + b/2;
     return mean;
  }

  public static int max(int a, int b) {
    int max;
    if (a >= b) { 
      max = a;
      }
    else {
      max = b;
      }
    return max;
      
  }
  public static double max(double a, double b) {
    double max;
    if (a >= b) { 
      max = a;
      }
    else {
      max = b;
      }
    return max;
  }
  

  public static int geoMean(int a, int b) {
    int geoMean;
    if(a*b>=0){
    	geoMean = sqrt(a + b);
      return geoMean;
    }
    else{
      System.out.print("undefined");
    }
  }
  public static double geoMean(double a, double b) {
    double geoMean;
    if (a*b>=0){
      geoMean = sqrt(a + b);
      return geoMean;
    }
    else{
      System.out.println("undefined");
    }
  }

  public static int geoMean(int a, int b, int c) {
    int geoMean;
    geoMean = cbrt(a*b*c);
    return geoMean;
  }
  public static double geoMean(double a, double b, double c) {
    double geoMean;
    geoMean = cbrt(a * b * c);
    return geoMean;
  }



}//end class
