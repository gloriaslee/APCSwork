public class Rational {

  private int num;
  private int denom;

  public Rational(){
    num = 0;
    denom = 1;
  }


  public  Rational(int a, int b){
    if (b == 0) {
      System.err.println("Error: Denominator is 0.");
      num = 0;
      denom = 1;
    }
    num = a;
    denom = b;
  }


  public double floatVal(Rational a){
    return (a.num/a.denom);
  }


  public String toString(Rational a){
    return a.num + "/" + a.denom ;
  }

  // public Rational multiply(Rational )

  public static void main(String[] args) {
    Rational a = new Rational();
    Rational r = new Rational(2, 3);
    Rational s = new Rational(1,2);
    Rational t = new Rational(3,0);

    System.out.println(a.toString());
    System.out.println(r.toString());
    System.out.println(s.toString());
    System.out.println(t);

    //System.out.println(r.multiply(s) + "...should be 2,6");
  }

}//end class
