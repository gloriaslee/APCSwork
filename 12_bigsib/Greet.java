public class Greet{
  public static void main(String[] args){
    String greeting;
    
    BigSib richard = new BigSib();
    richard.setHelloMsg("Word Up");
    
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
  } //end main()
} //end Greet
