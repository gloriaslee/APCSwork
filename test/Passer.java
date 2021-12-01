//3LuckyDuckies: Gloria Lee. Ziying Jian, Nora Miller

public class Passer{
  public static void main(String[] args){
    Passer a = new Passer();
    System.out.println(a);
    change(a);
    System.out.println(a);
  }

  public static void change(Passer b){
    System.out.println(b);
    b = new Passer();
    System.out.println(b);
  }
}
//If the last two outputs are the same, then Java is pass by reference
//because b is just an alias for a.
//If the last two outputs are different, then Java is pass by value
//because b simply points to a copy of the location of a. 
