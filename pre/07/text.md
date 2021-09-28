```javascript
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

public class Myexp{
  public static void main(String[], args){
    for(double i=0.1;i<=100;i*=10){
      check(i);
    }
    for(double b=-0.1;b>=-100;b*=10){
      check(b);
    }
  }

  public static double myexp(double x, int n){
    double finalvalue = 1;
    double numeratormult = 1;
    double denominatormult = 1;
    for(int a=1;a<n-1;a++){
      numeratormult=numeratormult*x;
      denominatormult=denominatormult*a;
      finalvalue=finalvalue + numeratormult/denominatormult;
    }
    return finalvalue
  }

  public static void check(double x){
    int num=26;
    System.out.println(x+"\\t"+ myexp(x, num)+"\\t"+Math.exp(x))
  }
}
```

Where did my factorial txt file go?
