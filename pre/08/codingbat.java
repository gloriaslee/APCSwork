/*Force*/
public double force(double g, double m1, double m2, double r){
  double force = g*m1*m2/r/r;
  return force;
}
/*Average*/
public double average3(int a, int b, int c){
  double sum = a+b+c;
  double average = sum/3 ;
  return average;
}
/*NegateOdds*/
public int oddsAreNegated(int x){
  if (x%2==0){
    return x;
  }else{
    return -x;
  }
}
/*noTeenSum*/
public int noTeenSum(int a, int b, int c) {
  int sum = fixTeen(a)+fixTeen(b)+fixTeen(c);
  return sum;
}
public int fixTeen(int n){
  if (n>=13 && n<=19){
    if (n==15||n==16){
      return n;
    }else{
      return 0;
    }
  }else{
    return n;
  }
  
}
