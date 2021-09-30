public class PowArray{
  public static void main(String[]args){
    powArray();
    histogram();
  }
  public static double[] powArray(double[] a,double power){
    double[] resultarray = new double[a.length];
    for (int var=0; var<a.length; var++){
      resultarray[var]=Math.pow(a[var], power);
    }
    return resultarray;
  }
  public static int[] histogram(int[] scores, int counters){
    int[] resulthistogram = new int[counters];
    for (int score=0; score<scores.length; score++){
      int index=scores[score];
      resulthistogram[score]++;
    }
    return resulthistogram;
  }



}
