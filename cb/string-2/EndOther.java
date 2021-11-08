public class EndOther{
  public static boolean endOther(String a, String b){
    int aLength = a.length();
    int bLength = b.length();
    a = a.toLowerCase();
    b = b.toLowerCase();
    String end;
    String word;
    if(aLength >= bLength){
      if(a.contains(b)){
        return true;
      }
      else{
        return false;
      }
    }
    else if(b.contains(a)){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String [] args){
    System.out.println(endOther("hellothere","ere"));
  }
}
