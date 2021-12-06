/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays

 // 3 Lucky Duckies: Gloria Lee, Ziying Jian, Nora Miller
 // APCS pd8
 // HW40 -- 2D arrays
 // 2021-11-30

 Time Spent: 1hr

 DISCO:

 * The compiler appears to be running toString when System.out.println(t) is invoked - see commented line

 * this can be used to reference other methods or instance variables of the instance invoking a given method.
 For the methods: use <method>(this)
 For the inst vars: use this.<instVar>


 QCC: Why is the first DISCO item true?
 ******************************/


public class Rational {

    private int numerator;
    private int denominator;

    public Rational(){
        this.numerator = 0;
        this.denominator = 1;
    }


    public  Rational(int a, int b){
        this();
        if (b == 0) {
            System.err.println("Error: denominator is 0. Set to 1.");
            numerator = a;
        } else {
            this.numerator = a;
            this.denominator = b;
        }
    }


    public double floatVal(){
        return ( (double) this.numerator /  this.denominator );
    }


    public String toString(){
        return ( numerator + "/" + denominator + " or " + floatVal()) ;
    }


/*
multiply
takes 1 Rational object as a parameter and multiplies it by this Rational object
does not return any value
should modify this object and leave the parameter alone (see below for example)
need not reduce the fraction
*/

    public void multiply(Rational a) {
        this.numerator = this.numerator * a.numerator; // this.numerator is the numerator of the instance of Rational invoking this method
        this.denominator = this.denominator * a.denominator;
    }


    public void divide(Rational b) {
        this.numerator = this.numerator * b.denominator;
        this.denominator = this.denominator * b.numerator;
    }


    public void add(Rational rat){
        int commonDenom = this.denominator * rat.denominator;
        this.numerator = this.numerator * rat.denominator; // this.numerator is multiplied
        int reset = rat.numerator;
        rat.numerator = rat.numerator * this.denominator;
        this.numerator = this.numerator + rat.numerator;
        this.denominator = commonDenom; // denominator is set to common multiple
        rat.numerator = reset; // resets parameter object to its original value
    }


    public void subtract(Rational rat){
        int commonDenom = this.denominator * rat.denominator;
        this.numerator = this.numerator *  rat.denominator;
        int reset = rat.numerator;
        rat.numerator = rat.numerator * this.denominator;
        this.denominator = commonDenom;
        this.numerator = this.numerator - rat.numerator;
        rat.numerator = reset; // resets parameter object to its original value
    }

    public int gcd( int numerator, int denominator ){
        while (numerator != denominator){
            if (numerator > denominator) {
                numerator-=denominator; // a = a - b
            } else {
                denominator-=numerator;
            }
        } return numerator;
    }

    public void reduce(){

        int gcd = gcd(this.numerator, this.denominator);

        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;

    }

    public int compareTo(Rational rat){

     // should be some variant of subtraction
     Rational diff = new Rational(this.numerator, this.denominator);
     diff.subtract(rat);
     if (diff.floatVal() == 0) {
       return 0;
     } else if(diff.floatVal()>0){
       return 1;
     } else {
       return -1;
     }
   }
      // since typecasting just chops off the decimal







    public static void main(String[] args) {

        Rational a = new Rational();
        Rational r = new Rational(2, 3);
        Rational s = new Rational(1,2);


        System.out.println( "//============testing constructors===========" );
        System.out.println( "Default constructor: " + a + "...expecting 0/1");
        System.out.println("Testing overwritten constructor error message:");
        Rational t = new Rational(3,0);
        System.out.println( "t: "+ t + "...expecting 3/1");
        System.out.println("\n");


    /* ~~============================================================================================~~ */
    /* ~~============================================================================================~~ */
    /* ~~================================= PREVIOUS TEST CASES ======================================~~ */
    /* ~~============================================================================================~~ */
    /* ~~============================================================================================~~ */

        System.out.println( "//============testing multiply/divide methods===========" );
        System.out.println(r + "...expected 2/3");
        System.out.println(s + "...expected 1/2");
        System.out.println("\n");
        r.multiply(s);
        System.out.println("AFTER MULTIPLYING....");
        System.out.println(r + "...expected 2/6");
        System.out.println(s + "...expected 1/2");
        System.out.println("\n");
        System.out.println( "//============testing float point values===========" );
        System.out.println("float value of r " + r.floatVal() + "...should be 0.3333");
        System.out.println("float value of s: " + s.floatVal() + "...should be 0.5" );

        r.multiply(a);
        System.out.println("AFTER MULTIPLYING AGAIN....");
        System.out.println(r + "...expected 0/6");
        System.out.println(a + "...expected 0/1");
        System.out.println("\n");

        t.divide(s);
        System.out.println("AFTER DIVIDING....");
        System.out.println("t is: " + t + "...expecting 6/1");
        System.out.println("s is: " + s + "...expecting 1/2");
        System.out.println("\n");



        /* ~~============================================================================================~~ */
        /* ~~============================================================================================~~ */
        /* ~~~~~~~~========================== NEW TEST CASES ===================================~~~~~~~~~~ */
        /* ~~============================================================================================~~ */
        /* ~~============================================================================================~~ */

        //resetting rationals to original values
        r = new Rational(2, 3);
        s = new Rational(1,2);
        t = new Rational(3,0);

        System.out.println( "//============testing add/subtract methods===========" );
        System.out.println("r is " + r); //
        System.out.println("s is " + s);
        r.add(s); // 4/6 + 1/2 = 7/6
        System.out.println( r + " addition...expected 7/6" );
        r.subtract(s); //expecting 7/6-1/2 = 8/12
        System.out.println(r + " subtraction... expected 8/12");
        System.out.println("\n");

        // TESTING THE ERROR
        System.out.println("s is " + s);
        System.out.println("t is " + t);
        s.add(t); // 1/2 + 3/1 = 7/2
        System.out.println( s + " addition...expected 7/2" );
        s.subtract(t); //expecting 7/2 - 3/1 = 1/2
        System.out.println( s + " subtraction... expected 1/2" );

        System.out.println( "//============testing reduce method===========" );
        System.out.println("r is " + r); //
        r.reduce();
        System.out.println("After reduction... r = " + r + " expected 2/3");
        System.out.println("t is " + t);
        t.reduce();
        System.out.println("After reduction... t = " + t + " expected 3/1");

        // Testing compareTo();

        System.out.println(r.compareTo(s) + " expected 1"); // expected 1
        System.out.println(s.compareTo(r) + " expected -1"); // expected -1
        System.out.println(r.compareTo(r) + " expected 0"); // expected 0
    }
}//end class
