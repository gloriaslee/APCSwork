public class Greet{
  String a;
  public Greet(){
    
  }
  public Greet(String ab){
    a = ab;
  }
  public static void sb(Greet abbb){
    abbb = null;
  }
  public static void main(String[] args){
    Greet sheesh = new Greet("abb");
    System.out.println(sheesh.a);
    //sheesh = null;
     sb(sheesh);
    System.out.println(sheesh.a);
  }
}
